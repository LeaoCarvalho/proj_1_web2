package com.example.proj_1_web2.productStore;

import com.example.proj_1_web2.ItemOperation.ItemOperation;
import com.example.proj_1_web2.product.Product;
import com.example.proj_1_web2.product.ProductRepository;
import com.example.proj_1_web2.store.Store;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;


@Table(name = "productstores")
@Entity(name = "productstores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProductStore {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int cost_price;
    private int sell_price;
    private int stock_amount;

    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    private Store store;

    @ManyToOne
    @JoinColumn(name = "fk_store_id")
    private Product product;

    @OneToMany(mappedBy = "productStore")
    private List<ItemOperation> itemOperations;

    public ProductStore(ProductStoreRequestDTO data, Product product, Store store) {
        this.cost_price = data.cost_price();
        this.sell_price = data.sell_price();
        this.stock_amount = data.stock_amount();
        this.store = store;
        this.product = product;
    }


}
