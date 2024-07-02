import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
    ArrayList<Product> getStockLevels();
    ArrayList<Order> getOrderStatuses();
    ArrayList<Supplier> getSupplierPerformance();

    Report getOrderCountByStatus();
    Report getStockCountByProduct();

    
}