package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.Order;
import com.ojas.service.OrderServiceImpl;

@RestController
@RequestMapping("/rest/order")
public class OrderController {

	@Autowired
	private OrderServiceImpl orderService;

	@PostMapping("/add")
	public Order addOrder(@RequestBody Order order) {
	orderService.addOrder(order);
		return order;
	}

	@GetMapping("/all")
	public List<Order> listOfOrders() {
		List<Order> list = orderService.listOfOrders();
		return list;
	}

	@GetMapping("/get")
	public Order getOrderById(@RequestParam int id) {
		Order order = orderService.getOrderById(id);
		return order;
	}

	@GetMapping("/user_order")
	public Order getProductByIdAndQuantity(@RequestParam int id,@RequestParam int quantity) {
		Order order = orderService.getProductByIdAndQuantity(id, quantity);
		return order;
	}

	@PostMapping("/update")
	public Order updateOrder(@RequestBody Order order,@RequestParam int order_id,@RequestParam int quantity) {
		Order ord =orderService.updateOrder(order, order_id, quantity);
		return ord;
	}
	@PostMapping("/palceOrd")
    public String placeOrd(@RequestParam int pid, @RequestParam int quentity, @RequestBody Order entity) {
		orderService.placeOrder(entity, pid, quentity);
        return "Order Placed Sucessfully";
    }

}
