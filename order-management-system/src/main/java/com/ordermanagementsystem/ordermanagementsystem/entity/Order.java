package com.ordermanagementsystem.ordermanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	private int orderId;
	private String orderName;
	private double orderAmount;
	private String orderDate;
	
	public Order() {
		
	}

	public Order(int orderId, String orderName, double orderAmount, String orderDate) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderAmount=" + orderAmount
				+ ", orderDate=" + orderDate + "]";
	}
}
