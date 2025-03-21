package com.example.invoicemanage.dto.request;

import lombok.Getter;

import java.io.Serializable;
import java.util.Set;

@Getter
public class OrderRequestDTO implements Serializable {

    private double totalPrice;

    private String note;

    private double deposite;

    private Set<ProductOrderRequestDTO> products;

}
