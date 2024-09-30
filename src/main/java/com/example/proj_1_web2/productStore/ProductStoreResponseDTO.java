package com.example.proj_1_web2.productStore;

public record ProductStoreResponseDTO(long id, int cost_price, int sell_price, int stock_amount, long jk_product_id, long jk_store_id) {

    public ProductStoreResponseDTO(ProductStore productStore) {
        this(productStore.getId(), productStore.getCost_price(), productStore.getSell_price(), productStore.getStock_amount(), productStore.getProduct().getId() , productStore.getStore().getId());
    }
}
