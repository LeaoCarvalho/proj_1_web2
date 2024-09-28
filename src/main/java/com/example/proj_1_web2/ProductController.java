package com.example.proj_1_web2;

import com.example.proj_1_web2.product.Product;
import com.example.proj_1_web2.product.ProductRepository;
import com.example.proj_1_web2.product.ProductRequestDTO;
import com.example.proj_1_web2.product.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ProductResponseDTO> getAll(){
        List<ProductResponseDTO> products = repository.findAll().stream().map(ProductResponseDTO::new).toList();
        return products;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveProduct(@RequestBody ProductRequestDTO data){
        Product productData = new Product(data);
        repository.save(productData);
        return;
    }

}
