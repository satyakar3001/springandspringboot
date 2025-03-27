package com.SpringBootAppOne.WebAppOne.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootAppOne.WebAppOne.model.Product;
import com.SpringBootAppOne.WebAppOne.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;

	public List<Product> getProducts() {
		
		return repo.findAll();
	}

	public Optional<Product> getProductById(int prodId) {
		return repo.findById(prodId);
	}

	public void addProduct(Product prod) {
		// TODO Auto-generated method stub
		repo.save(prod);
		
	}

	public void updateProduct(Product prod) {
		// TODO Auto-generated method stub
		repo.save(prod);
		
	}

	public void deleteProduct(int prodId) {
		// TODO Auto-generated method stub
		repo.deleteById(prodId);
		
	}
	

}
