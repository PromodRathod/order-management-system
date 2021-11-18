package com.ordermanagementsystem.ordermanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ordermanagementsystem.ordermanagementsystem.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
