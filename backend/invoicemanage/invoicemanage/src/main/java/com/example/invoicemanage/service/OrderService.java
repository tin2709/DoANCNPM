package com.example.invoicemanage.service;

import com.example.invoicemanage.dto.request.OrderRequestDTO;

public interface OrderService {
    int addOrder(OrderRequestDTO orderRequestDTO);
}
