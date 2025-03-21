package com.example.invoicemanage.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "order")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {

    @Column(name = "id")
    private int id;

    @Column(name = "totalPrice")
    private double totalPrice;

    @Column(name = "note")
    private String note;

    @Column(name = "OrderStatus")
    @Enumerated(EnumType.STRING)
    private Enum OrderStatus;

    @Column(name = "deposite")
    private double deposite;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<OrderItem> orderItems;

}
