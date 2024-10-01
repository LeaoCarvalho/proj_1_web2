package com.example.proj_1_web2.stockOperation;

import com.example.proj_1_web2.ItemOperation.ItemOperation;
import com.example.proj_1_web2.ItemOperation.ItemOperationService;
import com.example.proj_1_web2.productStore.ProductStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockOperationService {
    @Autowired
    private StockOperationRepository stockOperationRepository;

    @Autowired
    private ItemOperationService itemOperationService;

    public void addStockOperation(StockOperationRequestDTO data) {
        StockOperation stockOperation = new StockOperation(data);
        stockOperationRepository.save(stockOperation);
        data.itemOperationRequestDTOS().forEach(itemOperationRequestDTO ->
                {
                    itemOperationService.addItemOperation(itemOperationRequestDTO);
                }
                );
    }

    public List<StockOperationResponseDTO> getAll(){
        List<StockOperationResponseDTO> stockOperations = stockOperationRepository.findAll().stream().map(StockOperationResponseDTO::new).toList();
        return stockOperations;
    }
}
