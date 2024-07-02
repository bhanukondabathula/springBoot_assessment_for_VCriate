import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Product, Long> {
    ArrayList<Order> getAllProducts();

    Product getProductById(Long id);

    Product addProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}