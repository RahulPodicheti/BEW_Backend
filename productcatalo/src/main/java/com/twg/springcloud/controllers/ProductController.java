package com.twg.springcloud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twg.springcloud.model.Product;
import com.twg.springcloud.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")

public class ProductController {

	@Autowired
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
	return productService.getAllProducts();	
	}
	
	@GetMapping("/category/{categoryId}")
	public List<Product> getProductByCategoryId(@PathVariable long categoryId){
		return productService.getProductByCategoryId(categoryId);
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable long id){
		return productService.getProductById(id);
	}

}
