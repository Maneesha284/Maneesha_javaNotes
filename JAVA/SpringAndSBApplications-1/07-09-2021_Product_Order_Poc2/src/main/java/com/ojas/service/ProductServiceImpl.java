package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ojas.dao.ProductDaoRepository;
import com.ojas.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDaoRepository prodDao;

	@Override
	public Product addProduct(Product prod) {
		Product product =  prodDao.save(prod);
		return product;
	}

	@Override
	public List<Product> listOfProducts() {
		List<Product> list = prodDao.findAll();
		return list;
	}

	@Override
	public Product getProductById(int id) {
		Product prod = prodDao.findById(id).get();
		return prod;
	}
	
	
	
	
}
