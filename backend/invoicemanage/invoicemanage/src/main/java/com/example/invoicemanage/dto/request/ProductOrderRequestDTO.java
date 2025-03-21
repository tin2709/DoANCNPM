package com.example.invoicemanage.dto.request;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class ProductOrderRequestDTO implements Serializable {
    private int id;
    private int quantity;
}
