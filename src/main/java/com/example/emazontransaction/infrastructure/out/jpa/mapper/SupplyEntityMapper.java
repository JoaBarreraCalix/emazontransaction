package com.example.emazontransaction.infrastructure.out.jpa.mapper;


import com.example.emazontransaction.domain.model.Supply;
import com.example.emazontransaction.infrastructure.out.jpa.entity.SupplyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SupplyEntityMapper {

    SupplyEntity toEntity(Supply supply);

    Supply toDomain(SupplyEntity supplyEntity);
}

