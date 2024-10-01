package com.example.proj_1_web2.stockOperation;

import com.example.proj_1_web2.ItemOperation.ItemOperation;
import com.example.proj_1_web2.product.Product;
import com.example.proj_1_web2.productStore.ProductStore;
import com.example.proj_1_web2.productStore.ProductStoreRequestDTO;
import com.example.proj_1_web2.store.Store;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Table(name = "stockoperations")
@Entity(name = "stockoperations")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class StockOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private boolean operation; //true to buy, false to sell

    @OneToMany(mappedBy = "stockOperation")
    private List<ItemOperation> itemOperations;

    public StockOperation(StockOperationRequestDTO data) {
        this.date = data.date();
        this.operation = data.operation();
    }

}
