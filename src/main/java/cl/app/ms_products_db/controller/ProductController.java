package cl.app.ms_products_db.controller;

import cl.app.ms_products_db.model.dto.ProductDTO;
import cl.app.ms_products_db.model.entities.Product;
import cl.app.ms_products_db.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@Slf4j
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping()
    public ResponseEntity<List<ProductDTO>> findAll(){
        log.info("Request findAll()");
        List<ProductDTO> lista = productService.findAll();
        log.info("Response findAll(): {}", lista);
        return ResponseEntity.ok(lista);
    }

    @PostMapping()
    public ResponseEntity<ProductDTO> crearProducto(@RequestHeader(name = "x-country", required = true) String country,
                                                    @RequestHeader(name = "x-user", required = true) String user,
                                                    @RequestBody ProductDTO productDTO){
        log.info("Crear Producto Headers x-country: {}, x-user: {}", country, user);
        log.info("Crear Producto Request: {}, {}", productDTO.toString(), "OK");

        return ResponseEntity.ok(new ProductDTO());
    }
}
