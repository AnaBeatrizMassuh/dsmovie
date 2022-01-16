package com.devsuperior.dsmovie01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie01.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	
}
