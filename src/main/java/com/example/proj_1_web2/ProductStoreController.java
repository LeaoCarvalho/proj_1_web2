package com.example.proj_1_web2;

import com.example.proj_1_web2.product.Product;
import com.example.proj_1_web2.productStore.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product_store")
public class ProductStoreController {

    @Autowired
//    private ProductStoreRepository repository;

    private ProductStoreService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ProductStoreResponseDTO> getAll() {
        List<ProductStoreResponseDTO> productStores = service.getAll();
        return productStores;
    }

    @PostMapping
    public void saveProductStore(@RequestBody ProductStoreRequestDTO data) {
        service.addProductStore(data);
        return;
    }
}
