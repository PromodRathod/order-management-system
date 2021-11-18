package com.ordermanagementsystem.ordermanagementsystem.service;

import java.util.List;

import com.ordermanagementsystem.ordermanagementsystem.entity.Order;

public interface OrderService {

	public Order addOrder(Order order);
	public List<Order> getOrders();
}
