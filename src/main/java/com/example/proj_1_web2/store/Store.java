package com.example.proj_1_web2.store;

import com.example.proj_1_web2.productStore.ProductStore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "stores")
@Entity(name = "stores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Store {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "store")
    private List<ProductStore> productStores;

    public Store(StoreRequestDTO data) {
        this.name = data.name();
        this.address = data.address();
    }
}
