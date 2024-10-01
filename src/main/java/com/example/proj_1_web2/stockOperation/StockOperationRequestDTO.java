package com.example.proj_1_web2.stockOperation;

import com.example.proj_1_web2.ItemOperation.ItemOperationRequestDTO;

import java.util.Date;
import java.util.List;

public record StockOperationRequestDTO(Date date, boolean operation, List<ItemOperationRequestDTO> itemOperationRequestDTOS) {
//    public StockOperationRequestDTO(StockOperation stockOperation) {
//        this(   stockOperation.getDate(),
//                stockOperation.isOperation(),
//                stockOperation.getItemOperations().stream().map(ItemOperationRequestDTO::new).toList()
//        );
//    }
}
