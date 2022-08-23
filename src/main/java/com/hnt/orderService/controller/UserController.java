package com.hnt.orderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hnt.orderService.Entity.User;
import com.hnt.orderService.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping()
	String getUser() {
		return "test";
		
	}
	
	/*@GetMapping
	Iterable<User> getUser(){
		return userService.getUser();
	}*/

	@PostMapping()
	void saveUser(@RequestBody User user) {
		userService.save(user);
		
		//@PostMapping("/age/{age}/height/{height}")
		//@ResponseStatus(code=HttpStatus.CREATED)
		   //saveUser()
		
		}
		
	}


