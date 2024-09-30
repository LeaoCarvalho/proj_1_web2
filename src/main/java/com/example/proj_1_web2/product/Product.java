package com.example.proj_1_web2.product;

import com.example.proj_1_web2.productStore.ProductStore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name="products")
@Entity(name = "products")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "jk_product_id", referencedColumnName = "id")
//    private List<ProductStore> productStore;

    @OneToMany(mappedBy = "product")
    private List<ProductStore> productStores;


    public Product(ProductRequestDTO data) {
        this.name = data.name();
        this.description = data.description();
    }
}
