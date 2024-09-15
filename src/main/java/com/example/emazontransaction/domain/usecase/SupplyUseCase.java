package com.example.emazontransaction.domain.usecase;

import com.example.emazontransaction.common.Constants;
import com.example.emazontransaction.domain.api.ISupplyServicePort;
import com.example.emazontransaction.domain.model.Supply;
import com.example.emazontransaction.domain.spi.ISupplyPersistencePort;

import java.util.Optional;

public class SupplyUseCase implements ISupplyServicePort {

    private final ISupplyPersistencePort supplyPersistencePort;

    public SupplyUseCase(ISupplyPersistencePort supplyPersistencePort) {
        this.supplyPersistencePort = supplyPersistencePort;
    }


    @Override
    public void addSupply(Supply supply) {

        Optional<Supply> existingSupply = supplyPersistencePort.findSupplyByArticleId(supply.getArticleId());

        if (existingSupply.isPresent()) {
            Supply updatedSupply = existingSupply.get();
            updatedSupply.setQuantity(updatedSupply.getQuantity() + supply.getQuantity());
            updatedSupply.setUpdatedAt(supply.getUpdatedAt());
            supplyPersistencePort.saveSupply(updatedSupply);
        }else {
            supplyPersistencePort.saveSupply(supply);
        }

    }

    @Override
    public void updateSupply(Supply supply) {

    }

    @Override
    public Supply getSupplyByArticleId(Long articleId) {
        return supplyPersistencePort.findSupplyByArticleId(articleId)
                .orElseThrow(() -> new IllegalArgumentException(Constants.SUPPLY_NOT_FOUND_EXCEPTION + articleId));
    }
}
