package com.twg.springcloud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.springcloud.model.Product;
import com.twg.springcloud.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}


	public List<Product> getProductByCategoryId(long categoryId){
	
		return productRepository.findByCategoryId(categoryId);
	}

	public Product getProductById(long id) {
		return productRepository.findById(id).get();
	}
}
