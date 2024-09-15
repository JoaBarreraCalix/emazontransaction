package com.example.emazontransaction.domain.model;

import java.time.LocalDateTime;

public class Sale {

    private Long id;
    private Long articleId;
    private int quantitySold;
    private LocalDateTime saleDate;
    private Long buyerId;

    public Sale(Long id, Long articleId, int quantitySold, LocalDateTime saleDate, Long buyerId) {
        this.id = id;
        this.articleId = articleId;
        this.quantitySold = quantitySold;
        this.saleDate = saleDate;
        this.buyerId = buyerId;
    }

    public Sale() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }
}
