package com.ojas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ojas.dao.OrderDaoRepository;
import com.ojas.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDaoRepository orderDao;

	@Override
	public Order addOrder(Order order) {
		orderDao.save(order);
		return order;
	}

	@Override
	public List<Order> listOfOrders() {
		List<Order> list = orderDao.findAll();
		return list;
	}

	@Override
	public Order getOrderById(int id) {
		Order order = orderDao.findById(id).get();
		return order;
	}

	@Override
	public Order getProductByIdAndQuantity(int id, int quantity) {
		Order order = orderDao.findByProduct_idAndQuantity(id, quantity);
		return order;
	}

	@Override
	public Order updateOrder(Order order, int order_id, int quantity) {
		Order ord = orderDao.save(order);
		return ord;
	}

	@Override
	public Order placeOrder(Order order, int pId, int quentity) {
		return orderDao.save(order);
	}

}
