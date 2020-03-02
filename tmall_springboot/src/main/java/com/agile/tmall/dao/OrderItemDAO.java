package com.agile.tmall.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.tmall.pojo.Order;
import com.agile.tmall.pojo.OrderItem;
import com.agile.tmall.pojo.Product;
import com.agile.tmall.pojo.User;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}