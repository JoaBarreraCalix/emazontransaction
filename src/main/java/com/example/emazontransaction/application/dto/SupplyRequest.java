package com.example.emazontransaction.application.dto;

import com.example.emazontransaction.common.Constants;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupplyRequest {

    @NotNull(message = Constants.ARTICLE_ID_NOTNULL)
    private Long articleId;
    @Min(value = Constants.MIN_SUPPLY_VALUE, message = Constants.MIN_SUPPLY_MESSAGE)
    private int quantity;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
