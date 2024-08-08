package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.Product;

@Repository
public interface ProductDaoRepository extends JpaRepository<Product, Integer> {

	
}
