package com.agile.tmall.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.tmall.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
