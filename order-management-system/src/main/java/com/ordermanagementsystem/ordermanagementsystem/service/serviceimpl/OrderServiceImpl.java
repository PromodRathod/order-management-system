package com.ordermanagementsystem.ordermanagementsystem.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordermanagementsystem.ordermanagementsystem.entity.Order;
import com.ordermanagementsystem.ordermanagementsystem.repository.OrderRepository;
import com.ordermanagementsystem.ordermanagementsystem.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	public Order addOrder(Order order) {
		Order ord = orderRepository.save(order);
		return ord;
	}

	@Override
	public List<Order> getOrders() {
		List<Order> listOrder = orderRepository.findAll();
		return listOrder;
	}
}
