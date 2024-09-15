package com.example.emazontransaction.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplyResponse {
    private Long id;
    private Long articleId;
    private int quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
