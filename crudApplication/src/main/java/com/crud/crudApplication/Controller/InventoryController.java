package com.crud.crudApplication.Controller;

import com.crud.crudApplication.InventoryService.InventoryService;
import com.crud.crudApplication.Model.InventoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
@CrossOrigin(origins = "*")
public class InventoryController {
    @Autowired
    private InventoryService service;

    @GetMapping("/hello")
    public ResponseEntity<String> HelloWorld() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping
    public ResponseEntity<List<InventoryModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<InventoryModel> getById(@PathVariable int id) throws Exception {
        try{
            InventoryModel inventoryModel = service.findById(id);
            return ResponseEntity.ok(inventoryModel);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<InventoryModel> save(@RequestBody InventoryModel model) {
        InventoryModel saved = service.save(model);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<InventoryModel> update(@PathVariable int id, @RequestBody InventoryModel model) {
        try{
            InventoryModel saved = service.update(id, model);
            return new ResponseEntity<>(saved, HttpStatus.OK);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) throws Exception {
        try{
            service.delete(id);
            return ResponseEntity.noContent().build();
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
