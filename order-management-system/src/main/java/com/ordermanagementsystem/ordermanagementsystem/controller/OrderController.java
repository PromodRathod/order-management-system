package com.ordermanagementsystem.ordermanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ordermanagementsystem.ordermanagementsystem.entity.Order;
import com.ordermanagementsystem.ordermanagementsystem.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/createorder")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		Order ord = orderService.addOrder(order);
		return new ResponseEntity<Order>(ord, HttpStatus.OK);
	}
	
	@GetMapping("/getorders")
	public ResponseEntity<List<Order>> getOrder() {
		List<Order> listOrder = orderService.getOrders();
		return new ResponseEntity<List<Order>>(listOrder, HttpStatus.OK);
	}
}
