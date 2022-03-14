package com.guilhermelinares.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermelinares.demospring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
