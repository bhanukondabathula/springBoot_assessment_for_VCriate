import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    ArrayList<Supplier> getAllSuppliers();

    Supplier getSupplierById(Long id);

    Supplier addSupplier(Supplier supplier);

    Supplier updateSupplier(Long id, Supplier supplier);

    void deleteSupplier(Long id);

}