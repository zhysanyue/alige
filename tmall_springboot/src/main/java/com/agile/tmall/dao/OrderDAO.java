package com.agile.tmall.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.tmall.pojo.Order;
import com.agile.tmall.pojo.User;

public interface OrderDAO extends JpaRepository<Order,Integer>{
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}