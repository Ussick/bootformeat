package ua.itea.bootformeat.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.itea.bootformeat.model.ProductEntity;

import javax.persistence.NamedQuery;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
    //@Query("SELECT productEntity FROM Pudge productEntity")
    //Pudge getAllProducts(Pudge pudge);

    List<ProductEntity> getProductsByCategory(int id);
}
