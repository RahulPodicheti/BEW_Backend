package com.twg.springcloud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twg.springcloud.model.Category;
import com.twg.springcloud.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:5173")

public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	
	
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}



	@GetMapping
	public List<Category> getAllCategories(){
		return categoryService.findAllCategories();
	}
	
	@GetMapping("/{id}")
	public Category getCategoryById(@PathVariable long id){
		return categoryService.getCategoryById(id);
	}

}
