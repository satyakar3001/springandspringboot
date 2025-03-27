package com.SpringBootAppOne.WebAppOne.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.SpringBootAppOne.WebAppOne.model.Product;

@Service
public class productServiceLegacy {  

    private List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(100, "Wallet", 500), 
        new Product(101, "Phone", 23000),
        new Product(102, "Laptop", 45000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        for (Product product : products) {
            if (product.getProductId() == prodId) {
                return product;
            }
        }
        return null;
    }
    
    public void addProduct(Product prod)
    {
    	products.add(prod);
    }

	public void updateProduct(Product prod) {
		int itr = 0;
		for(Product product: products) {
			if(product.getProductId() == prod.getProductId()) {
				break;
			}
			itr+=1;
		}
		products.set(itr, prod);

	}

	public void deleteProduct(int prodId) {
		// TODO Auto-generated method stub
		int itr = 0;
		for(Product product: products) {
			if(product.getProductId() == prodId) {
				break;
			}
			itr += 1;
		}
		products.remove(itr);
	}
}
