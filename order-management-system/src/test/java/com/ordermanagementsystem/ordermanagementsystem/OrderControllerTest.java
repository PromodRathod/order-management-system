package com.ordermanagementsystem.ordermanagementsystem;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ordermanagementsystem.ordermanagementsystem.entity.Order;
import com.ordermanagementsystem.ordermanagementsystem.repository.OrderRepository;
import com.ordermanagementsystem.ordermanagementsystem.service.OrderService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class OrderControllerTest {

	@Autowired
	private OrderService orderService;
	
	@Test
	public void testCreateOrder() {
		Order order = new Order();
		order.setOrderId(1);
		order.setOrderName("New Order");
		order.setOrderAmount(3456.99);
		order.setOrderDate("2020-01-18");
		Order ord = orderService.addOrder(order);
		assertNotNull(ord);
	}
	
	@Test
	public void testFindAll() {
		List<Order> listOrder = orderService.getOrders();
		assertThat(listOrder).size().isGreaterThan(0);
	}
}
