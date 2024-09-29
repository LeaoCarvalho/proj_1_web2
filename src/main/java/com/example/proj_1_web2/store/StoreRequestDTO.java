package com.example.proj_1_web2.store;

import com.example.proj_1_web2.product.Product;

public record StoreRequestDTO(String name, String address) {
    public StoreRequestDTO(Store store){
        this(store.getName(), store.getAddress());
    }
}
