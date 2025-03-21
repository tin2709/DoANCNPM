package com.example.invoicemanage.model;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Table(name = "order_items")
@Builder
public class OrderItem {

    @Column(name = "id")
    private int id;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
