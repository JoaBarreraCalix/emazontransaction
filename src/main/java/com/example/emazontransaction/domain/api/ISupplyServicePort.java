package com.example.emazontransaction.domain.api;

import com.example.emazontransaction.domain.model.Supply;

public interface ISupplyServicePort {
    void addSupply(Supply supply);
    void updateSupply(Supply supply);
    Supply getSupplyByArticleId(Long articleId);
}
