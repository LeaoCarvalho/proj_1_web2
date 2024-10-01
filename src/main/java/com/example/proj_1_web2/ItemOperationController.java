package com.example.proj_1_web2;

import com.example.proj_1_web2.ItemOperation.ItemOperationRequestDTO;
import com.example.proj_1_web2.ItemOperation.ItemOperationResponseDTO;
import com.example.proj_1_web2.ItemOperation.ItemOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item_operation")
public class ItemOperationController {

    @Autowired
    private ItemOperationService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ItemOperationResponseDTO> getAll(){
        List<ItemOperationResponseDTO> itemOperations = service.getAll();
        return itemOperations;
    }
//    public String getAll(){
//        return  "batata";
//    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveItemOperation(@RequestBody ItemOperationRequestDTO data){
        service.addItemOperation(data);
    }

}
