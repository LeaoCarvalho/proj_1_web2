package com.example.proj_1_web2.ItemOperation;

public record ItemOperationRequestDTO(int amount, long fk_stockoperation_id, long fk_productstore_id) {
//    public ItemOperationRequestDTO(ItemOperation itemOperation) {
//        this(itemOperation.getAmount(), itemOperation.getStockOperation().getId(), itemOperation.getProductStore().getId());
//    }
}
