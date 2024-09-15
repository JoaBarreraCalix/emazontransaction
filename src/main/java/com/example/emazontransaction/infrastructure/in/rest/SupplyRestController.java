package com.example.emazontransaction.infrastructure.in.rest;

import com.example.emazontransaction.application.dto.SupplyRequest;
import com.example.emazontransaction.application.dto.SupplyResponse;
import com.example.emazontransaction.application.handler.SupplyHandler;
import com.example.emazontransaction.infrastructure.feignclient.StockFeignClient;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supply")
@RequiredArgsConstructor
@Tag(name = "Supply", description = "Operations related to adding supply")
public class SupplyRestController {

    private final SupplyHandler supplyHandler;
    private final StockFeignClient stockFeignClient;

    @Operation(summary = "Add supply to an article")
    @ApiResponse(responseCode = "201", description = "Supply added successfully", content = @Content)
    @PostMapping("/add")
    public ResponseEntity<SupplyResponse> addSupply(@Valid @RequestBody SupplyRequest supplyRequest) {
        // Verificamos si el artículo existe
        boolean articleExists = stockFeignClient.checkIfArticleExists(supplyRequest.getArticleId());
        if (!articleExists) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Llamamos al handler para procesar el suministro
        SupplyResponse response = supplyHandler.addSupply(supplyRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
