package com.inn.cafe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.inn.cafe.POJO.Category;
import com.inn.cafe.POJO.User;
import com.inn.cafe.wrapper.UserWrapper;

public interface CategoryDao extends JpaRepository<Category,Integer> {
	
	List<Category> getAllCategory();
	
	
	
	

}
