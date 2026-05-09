package cl.app.ms_products_db.repositories;

import cl.app.ms_products_db.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
