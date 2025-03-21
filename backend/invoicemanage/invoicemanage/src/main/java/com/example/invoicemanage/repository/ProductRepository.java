package com.example.invoicemanage.repository;

import com.example.invoicemanage.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {
}
