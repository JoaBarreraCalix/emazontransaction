package com.example.emazontransaction.application.handler;

import com.example.emazontransaction.application.dto.SupplyRequest;
import com.example.emazontransaction.application.dto.SupplyResponse;
import com.example.emazontransaction.application.mapper.SupplyMapper;
import com.example.emazontransaction.domain.api.ISupplyServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplyHandler {

    private final ISupplyServicePort supplyServicePort;
    private final SupplyMapper supplyMapper;

    public SupplyResponse addSupply(SupplyRequest supplyRequest) {
        var supply = supplyMapper.toSupply(supplyRequest);  // Mapea el request al modelo de dominio
        supplyServicePort.addSupply(supply);  // Agrega el supply a la base de datos
        return supplyMapper.toSupplyResponse(supply);  // Retorna la respuesta mapeada al DTO
    }
}
