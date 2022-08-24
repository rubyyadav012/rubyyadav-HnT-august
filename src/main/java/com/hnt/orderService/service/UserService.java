package com.hnt.orderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.orderService.Entity.User;
import com.hnt.orderService.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	  UserRepository userRespository;
	
	public void save(User user) {
		userRespository.save(user);
	}

	public Iterable<User> getUser() {
		// TODO Auto-generated method stub
		return userRespository.findAll();
	}

}
