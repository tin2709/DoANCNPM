package com.example.invoicemanage.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class InvoiceRequestDTO implements Serializable {
    private int userId;
    private int orderId;
    private double totalAmount;



}
