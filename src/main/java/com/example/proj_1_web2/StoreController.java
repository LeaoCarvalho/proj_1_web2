package com.example.proj_1_web2;

import com.example.proj_1_web2.store.Store;
import com.example.proj_1_web2.store.StoreRepository;
import com.example.proj_1_web2.store.StoreRequestDTO;
import com.example.proj_1_web2.store.StoreResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("store")
public class StoreController {
    @Autowired
    private StoreRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<StoreResponseDTO> getAll(){
        List<StoreResponseDTO> stores = repository.findAll().stream().map(StoreResponseDTO::new).toList();
        return stores;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveStore(@RequestBody StoreRequestDTO data){
        Store storeData = new Store(data);
        repository.save(storeData);
        return;
    }

}
