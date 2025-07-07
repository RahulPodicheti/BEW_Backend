package com.twg.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.springcloud.model.Product;
import com.twg.springcloud.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
	    return new ArrayList<>(productRepository.findAll());
	}



//	public List<Product> getProductByCategoryId(long categoryId){
//	
//		return productRepository.findByCategoryId(categoryId);
//	}

	public Product getProductById(long id) {
		return productRepository.findById(id).get();
	}



	public List<Product> getProductsByCategoryId(Long categoryId) {
		return productRepository.getProductsByCategoryId(categoryId);
	}



	public List<Product> getProductsByCategoryName(String categoryName) {
	    return productRepository.findByCategoryNameIgnoreCase(categoryName);
	}

}
