package com.ojas.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ojas.entity.Product;

public interface ProductService {

	public Product addProduct(Product prod);
	public List<Product> listOfProducts();
	public Product getProductById(int id);
}
