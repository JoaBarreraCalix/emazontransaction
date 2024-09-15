package com.example.emazontransaction.domain.usecase;

import com.example.emazontransaction.common.Constants;
import com.example.emazontransaction.domain.api.ISaleServicePort;
import com.example.emazontransaction.domain.model.Sale;
import com.example.emazontransaction.domain.spi.ISalesPersistencePort;

public class SaleUseCase implements ISaleServicePort {

    private final ISalesPersistencePort salesPersistencePort;

    public SaleUseCase(ISalesPersistencePort salesPersistencePort) {
        this.salesPersistencePort = salesPersistencePort;
    }


    @Override
    public void registerSale(Sale sale) {
        salesPersistencePort.saveSale(sale);
    }

    @Override
    public Sale getSaleById(Long saleId) {
        return salesPersistencePort.findSaleById(saleId)
                .orElseThrow(() -> new IllegalArgumentException(Constants.SALE_NOT_FOUND_EXCEPTION + saleId));
    }
}
