package com.example.emazontransaction.infrastructure.out.jpa.repository;


import com.example.emazontransaction.infrastructure.out.jpa.entity.SupplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SupplyRepository extends JpaRepository<SupplyEntity, Long> {
    Optional<SupplyEntity> findByArticleId(Long articleId);
}
