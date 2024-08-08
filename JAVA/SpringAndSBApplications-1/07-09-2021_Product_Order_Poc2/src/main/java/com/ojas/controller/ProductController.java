package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.Product;
import com.ojas.service.ProductService;

@RestController
@RequestMapping("/rest/product")
public class ProductController {

	@Autowired
	private ProductService prodService;

	@PostMapping("/add")
	public Product addProduct(@RequestBody Product prod) {
		Product product = prodService.addProduct(prod);
		return product;
	}

	@GetMapping("/all")
	public List<Product> listOfProducts() {
		List<Product> list = prodService.listOfProducts();
		return list;
	}

	@GetMapping("/get")
	public Product getProductById(@RequestParam int id) {
		Product prod = prodService.getProductById(id);
		return prod;
	}

}
