package com.example.proj_1_web2.ItemOperation;

import com.example.proj_1_web2.product.ProductResponseDTO;
import com.example.proj_1_web2.productStore.ProductStore;
import com.example.proj_1_web2.productStore.ProductStoreResponseDTO;

public record ItemOperationResponseDTO(long id, int amount, ProductStoreResponseDTO productStore) {
    public ItemOperationResponseDTO(ItemOperation itemOperation) {
        this(itemOperation.getId(), itemOperation.getAmount(), new ProductStoreResponseDTO(itemOperation.getProductStore()));
    }
}
