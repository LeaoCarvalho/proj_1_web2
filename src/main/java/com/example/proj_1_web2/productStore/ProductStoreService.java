package com.example.proj_1_web2.productStore;

import com.example.proj_1_web2.product.Product;
import com.example.proj_1_web2.product.ProductRepository;
import com.example.proj_1_web2.store.Store;
import com.example.proj_1_web2.store.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductStoreService {
    @Autowired
    private ProductStoreRepository productStoreRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private StoreRepository storeRepository;

    public void addProductStore(ProductStoreRequestDTO data) {
        Product product = productRepository.getReferenceById(data.fk_product_id());
        Store store     = storeRepository.getReferenceById(data.fk_store_id());
        ProductStore productStore = new ProductStore(data, product, store);
        productStoreRepository.save(productStore);
    }

    public List<ProductStoreResponseDTO> getAll() {
        List<ProductStoreResponseDTO> productStores = productStoreRepository.findAll().stream().map(ProductStoreResponseDTO::new).toList();
        return productStores;
    }
}
