package com.example.proj_1_web2.product;

public record ProductRequestDTO(String name, String description) {
    public ProductRequestDTO(Product product){
        this(product.getName(), product.getDescription());
    }
}
