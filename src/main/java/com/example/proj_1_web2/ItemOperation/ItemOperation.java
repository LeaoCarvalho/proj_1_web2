package com.example.proj_1_web2.ItemOperation;

import com.example.proj_1_web2.productStore.ProductStore;
import com.example.proj_1_web2.stockOperation.StockOperation;
import com.example.proj_1_web2.store.Store;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "itemoperations")
@Entity(name = "itemoperations")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ItemOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int amount;

    @ManyToOne
    @JoinColumn(name = "fk_stockoperation_id")
    private StockOperation stockOperation;

    @ManyToOne
    @JoinColumn(name = "fk_productstore_id")
    private ProductStore productStore;

    public ItemOperation(ItemOperationRequestDTO data, StockOperation stockOperation, ProductStore productStore) {
        this.amount = data.amount();
        this.stockOperation = stockOperation;
        this.productStore = productStore;
    }

}
