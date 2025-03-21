package com.example.invoicemanage.controller;

import com.example.invoicemanage.dto.request.OrderRequestDTO;
import com.example.invoicemanage.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping("/")
    public ResponseEntity<?> addOrder(@RequestBody OrderRequestDTO order){
        return new ResponseEntity<>(orderService.addOrder(order), HttpStatus.CREATED);
    }
}
