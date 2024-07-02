import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    ArrayList<Order> getAllOrders();

    Order getOrderById(Long id);

    Order addOrder(Order order);

    Order updateOrder(Long id, Order order);

    void deleteOrder(Long id);
}