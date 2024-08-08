package com.shiva.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.entity.StockPrice;
import com.shiva.exception.CompanyNotFoundException;
import com.shiva.repository.StockPriceRepository;
import com.shiva.service.StockPriceService;

@Service
public class StockpriceServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceRepository stockPriceRepo; 
	
	
	@Override
	public Double getStockPrice(String companyName) {
		// TODO Auto-generated method stub
		StockPrice stockPrice=stockPriceRepo.findByCompanyName(companyName);
		
		if(stockPrice==null)
		{
			throw new CompanyNotFoundException("Company Not Found");
		}
			
		
		return stockPrice.getCompanyPrice();
	}

}
