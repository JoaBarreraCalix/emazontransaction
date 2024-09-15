package com.example.emazontransaction.application.mapper;

import com.example.emazontransaction.application.dto.SupplyRequest;
import com.example.emazontransaction.application.dto.SupplyResponse;
import com.example.emazontransaction.domain.model.Supply;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface SupplyMapper {

    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "updatedAt", expression = "java(java.time.LocalDateTime.now())")
    Supply toSupply(SupplyRequest supplyRequest);
    SupplyResponse toSupplyResponse(Supply supply);

}
