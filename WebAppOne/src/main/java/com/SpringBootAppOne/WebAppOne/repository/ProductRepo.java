package com.SpringBootAppOne.WebAppOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootAppOne.WebAppOne.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
