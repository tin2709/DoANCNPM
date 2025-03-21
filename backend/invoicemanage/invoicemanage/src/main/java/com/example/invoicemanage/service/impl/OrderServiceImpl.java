package com.example.invoicemanage.service.impl;

import com.example.invoicemanage.dto.request.OrderRequestDTO;
import com.example.invoicemanage.dto.request.ProductOrderRequestDTO;
import com.example.invoicemanage.model.Order;
import com.example.invoicemanage.model.OrderItem;
import com.example.invoicemanage.repository.OrderRepository;
import com.example.invoicemanage.service.OrderService;
import com.example.invoicemanage.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final IProductService productService;
    @Override
    public int addOrder(OrderRequestDTO orderRequestDTO) {
        Order order = Order.builder()
                .deposite(orderRequestDTO.getDeposite())
                .note(orderRequestDTO.getNote())
                .build();
        order.setTotalPrice(calculateTotal(orderRequestDTO.getProducts().stream().toList()));
        order.setOrderItems((Set<OrderItem>) convertProductRequestDTOListToOrderItemList(orderRequestDTO.getProducts().stream().toList()));
        orderRepository.save(order);
        return order.getId();
    }
    private double calculateTotal(List<ProductOrderRequestDTO> productRequestDTOList){
        double total = 0;
        for (ProductOrderRequestDTO product : productRequestDTOList) {
            total+= productService.getProductById(product.getId()).getPrice();
        }
        return total;
    }
    private List<OrderItem> convertProductRequestDTOListToOrderItemList(List<ProductOrderRequestDTO> productRequestDTOList){
        List<OrderItem> orderItemList = new ArrayList<>();

        for (ProductOrderRequestDTO product : productRequestDTOList) {
            OrderItem order = OrderItem.builder()
                    .quantity(product.getQuantity())
                    .product(productService.getProductById(product.getId()))
                    .build();
            orderItemList.add(order);
        }

        return orderItemList;
    }
}
