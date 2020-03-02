package com.agile.tmall.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.tmall.pojo.Product;
import com.agile.tmall.pojo.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
	public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
	
}
