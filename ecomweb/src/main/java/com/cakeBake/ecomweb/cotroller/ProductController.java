package com.cakeBake.ecomweb.cotroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cakeBake.ecomweb.models.Product;
import com.cakeBake.ecomweb.service.ProductServices;
import java.util.*;
@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductServices service;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		return new ResponseEntity<>(service.getProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/product/{prodId}")
	public ResponseEntity<Product> getProdId(@PathVariable int prodId) {
		Product prod = service.getProdId(prodId);
		
		if(prod != null)
			return new ResponseEntity<>(prod, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	@PostMapping("/product")
	public ResponseEntity<?> addProduct(@RequestPart Product prod, @RequestPart MultipartFile imageFile){
		try {
			Product prod1 = (Product) service.addProduct(prod,imageFile);
			return new ResponseEntity<>(prod1, HttpStatus.ACCEPTED);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.METHOD_NOT_ALLOWED);
		}
	}
}
