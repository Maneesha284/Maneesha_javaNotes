package com.shiva.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.model.Customer;

@RestController
public class CustomerClient {

	@RequestMapping("/custf")
	//defines a cache for method return value
	@Cacheable(value = "customerInfo")
	public List Customerinformation()
	{
		System.out.println("Customer information from cache");
		//adding customer details in the list
		
		List <Customer>details=Arrays.asList(new Customer(12345,"shiva","saving",45000),
				new Customer(12345,"shiva","saving",45000));	
	
		return details;
	}
	

}
