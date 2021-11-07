package ua.itea.bootformeat.model;

import javax.persistence.*;

@Entity
@Table
public class Product2category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name="product_id", nullable = false, foreignKey = @ForeignKey(name = "id"))
    private ProductEntity productEntity;

    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name="category_id", nullable = false, foreignKey = @ForeignKey(name = "id"))
    private CategoryEntity categoryEntity;
}
