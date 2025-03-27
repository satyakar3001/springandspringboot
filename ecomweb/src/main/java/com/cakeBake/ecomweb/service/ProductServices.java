package com.cakeBake.ecomweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cakeBake.ecomweb.models.Product;
import com.cakeBake.ecomweb.repository.productRepo;

import java.io.IOException;
import java.util.*;

@Service
public class ProductServices {
	
	@Autowired
	productRepo Products;
	
	public List<Product> getProducts()
	{
		System.out.println(Products.findAll());
		return Products.findAll();
	}

	public Product getProdId(int prodId) {
		// TODO Auto-generated method stub
		return Products.findById(prodId).orElse(new Product());
	}


	public Product addProduct(Product prod, MultipartFile imageFile) throws IOException {
		// TODO Auto-generated method stub
		prod.setImageName(imageFile.getOriginalFilename());
		prod.setImagedata(imageFile.getBytes());
		prod.setImageType(imageFile.getContentType());
		return Products.save(prod);
	}
	
	
}
