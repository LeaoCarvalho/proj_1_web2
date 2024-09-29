package com.example.proj_1_web2.store;

public record StoreResponseDTO(long id, String name, String address) {
    public StoreResponseDTO(Store store){
        this(store.getId(), store.getName(), store.getAddress());
    }
}
