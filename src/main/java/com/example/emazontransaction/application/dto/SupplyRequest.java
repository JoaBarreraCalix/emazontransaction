package com.example.emazontransaction.application.dto;

import com.example.emazontransaction.common.Constants;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

public class SupplyRequest {

    @NotNull(message = Constants.ARTICLE_ID_NOTNULL)
    private Long articleId;

    @Min(value = Constants.MIN_SUPPLY_VALUE, message = Constants.MIN_SUPPLY_MESSAGE)
    private int quantity;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters y Setters manuales

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
