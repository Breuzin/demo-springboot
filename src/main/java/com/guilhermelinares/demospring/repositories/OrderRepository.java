package com.guilhermelinares.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermelinares.demospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
