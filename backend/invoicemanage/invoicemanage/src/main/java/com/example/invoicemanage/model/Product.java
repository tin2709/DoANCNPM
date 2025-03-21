package com.example.invoicemanage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Builder
@AllArgsConstructor
@Getter
@Setter
public class Product {
    @Column(name = "id")
    private int id;

    @Column(name = "price")
    private double price;
}
