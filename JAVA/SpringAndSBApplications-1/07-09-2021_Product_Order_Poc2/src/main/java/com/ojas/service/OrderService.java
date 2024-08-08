package com.ojas.service;

import java.util.List;

import com.ojas.entity.Order;


public interface OrderService {

	public Order addOrder(Order order);
	public List<Order> listOfOrders();
	public Order getOrderById(int id);
	public Order getProductByIdAndQuantity(int id,int quantity);
	public Order updateOrder(Order order,int order_id,int quantity);
	public Order placeOrder(Order order, int pId, int quentity) ;
}
