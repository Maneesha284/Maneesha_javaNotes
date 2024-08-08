package com.shiva.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockUiService {

	public String getTotalStockPrice(String companyName,Integer quantity)
	{
		
	String REST_ENDPOINT="http://localhost:9090/calc/calculate{companyName/{quantity}";
	String response=null;
	WebClient webClient=WebClient.create();
	
	try {
		response = webClient.get().uri(REST_ENDPOINT, companyName, quantity).retrieve().bodyToMono(String.class)
				.block();
	} catch (Exception e) {
		// TODO: handle exception
		response="Company Name Not Found";
	}
		return response;
		
	}
}
