package com.proshoppe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proshoppe.dao.UserRepository;
import com.proshoppe.model.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/get")
	public List<User> getAllUsers() {
		System.out.println("Jumping into rest controller");
		System.out.println("hii");
		System.out.println("My user repository" + userRepository.findAll());
		return userRepository.findAll(); // select * from Users
	}

}