package cl.app.ms_products_db.service;

import cl.app.ms_products_db.model.entities.Product;
import cl.app.ms_products_db.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

}
