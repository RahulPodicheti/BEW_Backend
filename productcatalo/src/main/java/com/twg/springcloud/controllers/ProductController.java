package com.twg.springcloud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public List<Product> getAllProducts(@RequestParam(value = "category", required = false) String categoryName) {
	    if (categoryName != null && !categoryName.isEmpty()) {
	        return productService.getProductsByCategoryName(categoryName);
	    }
	    return productService.getAllProducts();
	}

	
//	@GetMapping("/category/{categoryId}")
//	public List<Product> getProductByCategoryId(@PathVariable long categoryId){
//		return productService.getProductByCategoryId(categoryId);
//	}
	
	@GetMapping("/category/{categoryId}")
	public List<Product> getProductsByCategory(@PathVariable Long categoryId) {
	    return productService.getProductsByCategoryId(categoryId);
	}

	
	@GetMapping("/{id}")	
	public Product getProductById(@PathVariable long id){
		return productService.getProductById(id);
	}

}
