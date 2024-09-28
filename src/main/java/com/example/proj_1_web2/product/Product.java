package com.example.proj_1_web2.product;

import jakarta.persistence.*;

@Table(name="products")
@Entity(name = "products")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
}
