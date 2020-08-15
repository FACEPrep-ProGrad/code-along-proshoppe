package com.proshoppe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proshoppe.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Override
	List<User> findAll();
}
