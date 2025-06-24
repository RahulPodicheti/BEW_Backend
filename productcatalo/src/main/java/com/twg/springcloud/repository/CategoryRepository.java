package com.twg.springcloud.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springcloud.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
