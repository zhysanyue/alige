package com.agile.tmall.dao;
 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.tmall.pojo.Product;
import com.agile.tmall.pojo.Property;
import com.agile.tmall.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

	List<PropertyValue> findByProductOrderByIdDesc(Product product);
	PropertyValue getByPropertyAndProduct(Property property, Product product);

	
	
	
}
