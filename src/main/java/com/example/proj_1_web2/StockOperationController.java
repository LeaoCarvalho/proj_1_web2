package com.example.proj_1_web2;

import com.example.proj_1_web2.stockOperation.StockOperationRequestDTO;
import com.example.proj_1_web2.stockOperation.StockOperationResponseDTO;
import com.example.proj_1_web2.stockOperation.StockOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stock_operation")
public class StockOperationController {
    @Autowired
    private StockOperationService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<StockOperationResponseDTO> getAll() {
        List<StockOperationResponseDTO> stockOperations = service.getAll();
        return stockOperations;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveStockOperation(@RequestBody StockOperationRequestDTO data) {
        service.addStockOperation(data);
    }
}
