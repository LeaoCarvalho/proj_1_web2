package com.example.proj_1_web2.productStore;

public record ProductStoreRequestDTO(int cost_price, int sell_price, int stock_amount, long fk_product_id, long fk_store_id) {
//    public ProductStoreRequestDTO(ProductStore productStore) {
//        this(productStore.getCost_price(), productStore.getSell_price(), productStore.getStock_amount(), productStore.getProduct().getId(), productStore.getStore().getId());
//    }
}
