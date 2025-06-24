package com.twg.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.springcloud.model.Category;
import com.twg.springcloud.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	

	public CategoryService(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}



	public List<Category> findAllCategories() {
		return categoryRepository.findAll();
	}


	public Category getCategoryById(long id) {
		return categoryRepository.findById(id).get();
	}
	
}
