package com.example.emazontransaction.domain.spi;

import com.example.emazontransaction.domain.model.Sale;

import java.util.Optional;

public interface ISalesPersistencePort {
    void saveSale(Sale sale);
    Optional<Sale> findSaleById(Long saleId);
}
