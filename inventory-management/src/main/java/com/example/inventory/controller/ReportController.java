package com.example.inventory.controller;

import com.example.inventory.dto.OrderStatusReport;
import com.example.inventory.dto.StockLevelReport;
import com.example.inventory.dto.SupplierPerformanceReport;
import com.example.inventory.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    // Get stock levels report
    @GetMapping("/stock-levels")
    public List<StockLevelReport> getStockLevels() {
        return reportService.getStockLevels();
    }

    // Get order statuses report
    @GetMapping("/order-statuses")
    public List<OrderStatusReport> getOrderStatuses() {
        return reportService.getOrderStatuses();
    }

    // Get supplier performance report
    @GetMapping("/supplier-performance")
    public List<SupplierPerformanceReport> getSupplierPerformance() {
        return reportService.getSupplierPerformance();
    }

    // Get order count by status report
    @GetMapping("/order-count-by-status")
    public Map<String, Long> getOrderCountByStatus() {
        return reportService.getOrderCountByStatus();
    }

    // Get stock count by product report
    @GetMapping("/stock-count-by-product")
    public Map<Long, Long> getStockCountByProduct() {
        return reportService.getStockCountByProduct();
    }
}