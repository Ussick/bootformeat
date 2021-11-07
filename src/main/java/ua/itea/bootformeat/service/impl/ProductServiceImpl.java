package ua.itea.bootformeat.service.impl;

import org.springframework.stereotype.Service;
import ua.itea.bootformeat.model.ProductEntity;
import ua.itea.bootformeat.repository.ProductRepository;
import ua.itea.bootformeat.service.ProductServce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductServce {
    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductEntity> getProducts() {
        if (repository.findAll()!=null){
            System.out.println(repository.findAll());
            return repository.findAll();
        }else {
            return new ArrayList<>();
        }
    }

    @Override
    public List<ProductEntity> getProductsByCategoryId(int id) {
        if (repository.getProductsByCategory(id)!=null){
            System.out.println(repository.getProductsByCategory(id));
            return repository.getProductsByCategory(id);
        }else {
            return new ArrayList<>();
        }
    }

    @Override
    public ProductEntity getProductById(int id) {
        Optional<ProductEntity> byId = repository.findById(id);
        ProductEntity productEntity=(byId.isPresent())? byId.get(): new ProductEntity();
        return productEntity;
    }
}
