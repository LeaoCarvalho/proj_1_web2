package com.example.proj_1_web2;

import com.example.proj_1_web2.product.Product;
import com.example.proj_1_web2.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public String getAll(){
        return "Batata";
    }
//    public List<Product> getAll(){
//        List<Product> products = repository.findAll();
//        return products;
//    }

}
