package com.example.proj_1_web2.ItemOperation;

import com.example.proj_1_web2.product.ProductRepository;
import com.example.proj_1_web2.productStore.ProductStore;
import com.example.proj_1_web2.productStore.ProductStoreRepository;
import com.example.proj_1_web2.stockOperation.StockOperation;
import com.example.proj_1_web2.stockOperation.StockOperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ItemOperationService {

    @Autowired
    private ItemOperationRepository itemOperationRepository;

    @Autowired
    private StockOperationRepository stockOperationRepository;

    @Autowired
    private ProductStoreRepository productStoreRepository;

    public void addItemOperation(ItemOperationRequestDTO data) {
        StockOperation stockOperation = stockOperationRepository.getReferenceById(data.fk_stockoperation_id());
        ProductStore productStore = productStoreRepository.getReferenceById(data.fk_productstore_id());
        ItemOperation itemOperation = new
                ItemOperation(data,
                              stockOperation,
                              productStore);
        itemOperationRepository.save(itemOperation);
    }

    public List<ItemOperationResponseDTO> getAll(){
        List<ItemOperationResponseDTO> itemOperations = itemOperationRepository.findAll().stream().map(ItemOperationResponseDTO::new).toList();
        return itemOperations;
    }

//    //        Product product = productRepository.getReferenceById(data.fk_product_id());
////        Store store     = storeRepository.getReferenceById(data.fk_store_id());
////        ProductStore productStore = new ProductStore(data, product, store);
////        productStoreRepository.save(productStore);

//    @ManyToOne
//    @JoinColumn(name = "fk_stockoperation_id")
//    private StockOperation stockOperation;
//
//    @ManyToOne
//    @JoinColumn(name = "fk_productstore_id")
//    private ProductStore productStore;
}
