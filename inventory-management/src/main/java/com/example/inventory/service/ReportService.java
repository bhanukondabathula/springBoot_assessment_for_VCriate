package com.example.inventory.service;

import com.example.inventory.model.Order;
import com.example.inventory.model.Product;
import com.example.inventory.model.Supplier;
import com.example.inventory.repository.OrderRepository;
import com.example.inventory.repository.ProductRepository;
import com.example.inventory.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ReportService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Product> getStockLevels() {
        return productRepository.findAll();
    }

    public List<Order> getOrderStatuses() {
        return orderRepository.findAll();
    }

    public List<Supplier> getSupplierPerformance() {
        return supplierRepository.findAll();
    }

    public Map<String, Long> getOrderCountByStatus() {
        return orderRepository.findAll().stream()
                .collect(Collectors.groupingBy(Order::getStatus, Collectors.counting()));
    }

    public Map<Long, Long> getStockCountByProduct() {
        return productRepository.findAll().stream()
                .collect(Collectors.toMap(Product::getId, Product::getQuantity));
    }
}