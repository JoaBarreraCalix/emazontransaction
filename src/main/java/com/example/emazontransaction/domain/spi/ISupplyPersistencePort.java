package com.example.emazontransaction.domain.spi;

import com.example.emazontransaction.domain.model.Supply;

import java.util.Optional;

public interface ISupplyPersistencePort {
    void saveSupply(Supply supply);
    Optional<Supply> findSupplyByArticleId(Long articleId);
}
