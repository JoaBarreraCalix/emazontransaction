package com.example.emazontransaction.domain.api;

import com.example.emazontransaction.domain.model.Sale;

import java.util.List;

public interface ISaleServicePort {
    void registerSale(Sale sale);
    Sale getSaleById(Long saleId);
}
