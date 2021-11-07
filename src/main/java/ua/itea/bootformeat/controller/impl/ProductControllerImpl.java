package ua.itea.bootformeat.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ua.itea.bootformeat.model.ProductEntity;
import ua.itea.bootformeat.controller.ProductController;
import ua.itea.bootformeat.service.ProductServce;

import java.util.List;

@RestController
public class ProductControllerImpl implements ProductController {
    private final ProductServce service;
    public ProductControllerImpl(ProductServce service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<ProductEntity> getProduct(String id) {
        return new ResponseEntity<>(service.getProductById(Integer.valueOf(id)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<ProductEntity>> getProductsByCategory(String id) {
        return new ResponseEntity<>(service.getProductsByCategoryId(Integer.valueOf(id)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<ProductEntity>> getAllproducts() {
        return new ResponseEntity<>(service.getProducts(),HttpStatus.OK);
    }
}
