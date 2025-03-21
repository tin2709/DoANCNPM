package com.example.invoicemanage.service.impl;

import com.example.invoicemanage.model.Product;
import com.example.invoicemanage.repository.ProductRepository;
import com.example.invoicemanage.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {
    private final ProductRepository productRepository;
    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
