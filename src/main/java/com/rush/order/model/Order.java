package com.rush.order.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private Double amount;
    private String status;
    private LocalDateTime orderTime = LocalDateTime.now();

    // Getters & Setters
}
