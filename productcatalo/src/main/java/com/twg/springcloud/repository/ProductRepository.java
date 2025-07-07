package com.twg.springcloud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springcloud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

//	public List<Product> findByCategoryId(Long categoryId);

	public List<Product> getProductsByCategoryId(Long categoryId);

	List<Product> findByCategoryNameIgnoreCase(String categoryName);
	
	
}
