package com.cakeBake.ecomweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cakeBake.ecomweb.models.Product;

@Repository
public interface productRepo extends JpaRepository<Product, Integer> {

}
