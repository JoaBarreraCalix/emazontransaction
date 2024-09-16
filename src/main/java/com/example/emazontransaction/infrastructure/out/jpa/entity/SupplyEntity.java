package com.example.emazontransaction.infrastructure.out.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "supply")
public class SupplyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Asegúrate de que este campo exista y esté correctamente nombrado
    @Column(name = "article_id")
    private Long articleId;

    // Asegúrate de que este campo exista y esté correctamente nombrado
    @Column(name = "quantity")
    private int quantity;

    // Asegúrate de que este campo exista y esté correctamente nombrado
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Asegúrate de que este campo exista y esté correctamente nombrado
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}

