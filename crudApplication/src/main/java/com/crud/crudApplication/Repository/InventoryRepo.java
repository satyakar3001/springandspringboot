package com.crud.crudApplication.Repository;

import com.crud.crudApplication.Model.InventoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<InventoryModel, Integer> {
}
