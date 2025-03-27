package com.SpringBootAppOne.WebAppOne.controller;

import com.SpringBootAppOne.WebAppOne.service.ProductService;
import com.SpringBootAppOne.WebAppOne.service.productServiceLegacy;
import com.SpringBootAppOne.WebAppOne.model.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class productController {
	
//	@Autowired
//	productServiceLegacy service;
	
	@Autowired
	ProductService service;

	@GetMapping
	public List<Product> get_products() {
		return service.getProducts();
	}
	
	@GetMapping("/{prodId}")
	public Optional<Product> get_productbyId(@PathVariable int prodId) {
		return service.getProductById(prodId);
	}
	
	@PostMapping("/addproduct")
	public String addProduct(@RequestBody Product prod) {
		if (prod == null || prod.getProductId() == 0 || 
		    prod.getProductName() == null || prod.getPrice() == 0) {
			return "Error in prod creation";
		}
		service.addProduct(prod);
        return "Product added successfully: " + prod.getProductName();
	}
	
	@PutMapping
	public String updateProduct(@RequestBody Product prod) {
		if (prod == null || prod.getProductId() == 0 || 
			    prod.getProductName() == null || prod.getPrice() == 0) {
				return "Error in prod creation";
			}
			service.updateProduct(prod);
	        return "Product updated successfully: " + prod.getProductName();
	}
	
	@DeleteMapping("/{prodId}")
	public String deleteProduct(@PathVariable int prodId) {
		service.deleteProduct(prodId);
		return "Product deleted successfully with id" + prodId;
	}
	
}
