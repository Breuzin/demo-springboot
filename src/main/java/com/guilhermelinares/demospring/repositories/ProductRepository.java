package com.guilhermelinares.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermelinares.demospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
