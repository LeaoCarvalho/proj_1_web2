package com.example.proj_1_web2.productStore;

import com.example.proj_1_web2.product.ProductResponseDTO;
import com.example.proj_1_web2.store.StoreResponseDTO;

public record ProductStoreResponseDTO(long id, int cost_price, int sell_price, int stock_amount, ProductResponseDTO product, StoreResponseDTO store /*long jk_product_id, long jk_store_id*/) {

    public ProductStoreResponseDTO(ProductStore productStore) {
        this(productStore.getId(), productStore.getCost_price(), productStore.getSell_price(), productStore.getStock_amount(), new ProductResponseDTO(productStore.getProduct()), new StoreResponseDTO(productStore.getStore()));
    }
}
