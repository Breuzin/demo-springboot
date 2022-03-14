package com.guilhermelinares.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermelinares.demospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
