package ua.itea.bootformeat.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.itea.bootformeat.model.ProductEntity;

import java.util.List;

@RequestMapping("/products")
public interface ProductController {


    @GetMapping(params = {"id"})
    ResponseEntity<ProductEntity> getProduct(@RequestParam(name = "id") String id);

    @GetMapping(params = {"category"})
    ResponseEntity <List<ProductEntity>> getProductsByCategory(@RequestParam(name = "category") String id);

    @GetMapping
    ResponseEntity<List<ProductEntity>> getAllproducts();

}
