package com.crud.crudApplication.InventoryService;

import com.crud.crudApplication.Model.InventoryModel;
import com.crud.crudApplication.Repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    InventoryRepo inventoryRepo;

    // get all values
    public List<InventoryModel> findAll() {
        return inventoryRepo.findAll();
    }
    // get product by pk
    public InventoryModel findById(int id) throws Exception{
        return inventoryRepo.findById(id).orElseThrow();
    }
    // post mapping
    public InventoryModel save(InventoryModel model) {
        return inventoryRepo.save(model);
    }

    // update product
    public InventoryModel update(int id, InventoryModel inventoryModel){
        InventoryModel existing = inventoryRepo.findById(id).orElseThrow();
        existing.setName(inventoryModel.getName());
        existing.setDescription(inventoryModel.getDescription());
        return inventoryRepo.save(existing);
    }
    // delete
    public void delete(int id) throws Exception{
        inventoryRepo.deleteById(id);
    }

}
