package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ojas.entity.Order;

@Repository
public interface OrderDaoRepository extends JpaRepository<Order, Integer>{

	@Query("from Order where product_id=:product_id and quantity=:quantity")
	public Order findByProduct_idAndQuantity(int product_id,int quantity);

}
