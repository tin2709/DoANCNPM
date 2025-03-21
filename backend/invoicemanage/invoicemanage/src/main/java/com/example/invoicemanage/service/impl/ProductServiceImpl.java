package com.example.invoicemanage.service.impl;

import com.example.invoicemanage.model.Product;
import com.example.invoicemanage.repository.ProductRepository;
import com.example.invoicemanage.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
