package com.example.emazontransaction.infrastructure.out.jpa.adapter;

import com.example.emazontransaction.domain.model.Supply;
import com.example.emazontransaction.domain.spi.ISupplyPersistencePort;
import com.example.emazontransaction.infrastructure.out.jpa.mapper.SupplyEntityMapper;
import com.example.emazontransaction.infrastructure.out.jpa.repository.SupplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SupplyJpaAdapter implements ISupplyPersistencePort {

    private final SupplyRepository supplyRepository;
    private final SupplyEntityMapper supplyEntityMapper;


    @Override
    public void saveSupply(Supply supply) {
        supplyRepository.save(supplyEntityMapper.toEntity(supply));
    }

    @Override
    public Optional<Supply> findSupplyByArticleId(Long articleId) {
        return supplyRepository.findByArticleId(articleId).map(supplyEntityMapper::toDomain);
    }
}
