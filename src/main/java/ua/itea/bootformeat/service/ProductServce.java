package ua.itea.bootformeat.service;

import ua.itea.bootformeat.model.ProductEntity;

import java.util.List;

public interface ProductServce {
    List<ProductEntity> getProducts();
    List<ProductEntity> getProductsByCategoryId(int id);
    ProductEntity getProductById(int id);
}
