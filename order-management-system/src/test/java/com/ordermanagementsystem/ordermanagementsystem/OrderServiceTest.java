package com.ordermanagementsystem.ordermanagementsystem;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ordermanagementsystem.ordermanagementsystem.entity.Order;
import com.ordermanagementsystem.ordermanagementsystem.repository.OrderRepository;
import com.ordermanagementsystem.ordermanagementsystem.service.OrderService;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class OrderServiceTest {

	@Autowired
	private OrderRepository orderRepository;
	
	@Test
	public void testCreateOrder() {
		Order order = new Order();
		order.setOrderId(1);
		order.setOrderName("New Order");
		order.setOrderAmount(3456.99);
		order.setOrderDate("2020-01-18");
		orderRepository.save(order);
		assertNotNull(orderRepository.findById(order.getOrderId()).get());;
	}
	
	@Test
	public void testFindAll() {
		List<Order> listOrder = orderRepository.findAll();
		assertThat(listOrder).size().isGreaterThan(0);
	}
}
