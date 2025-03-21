package com.example.invoicemanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.invoicemanage.entity")
public class InvoicemanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoicemanageApplication.class, args);
	}

}
