package com.guilhermelinares.demospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermelinares.demospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
