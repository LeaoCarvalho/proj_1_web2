package com.example.proj_1_web2.product;

public record ProductResponseDTO(long id, String name, String description) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getDescription());
    }
}
