package com.example.proj_1_web2.stockOperation;

import com.example.proj_1_web2.ItemOperation.ItemOperationResponseDTO;

import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

public record StockOperationResponseDTO(long id, Date date, boolean operation, List<ItemOperationResponseDTO> itemOperationResponseDTOS) {
    public StockOperationResponseDTO(StockOperation stockOperation) {
        this(stockOperation.getId(),
                stockOperation.getDate(),
                stockOperation.isOperation(),
                stockOperation.
                        getItemOperations().
                        stream().
                        map(ItemOperationResponseDTO::new)
                        .toList()
        );
    }
}
