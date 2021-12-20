package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;

@RestController
public class UserController {
	@Autowired
	IUserService userService;

	@PostMapping("/user")
	String createUser(@RequestBody User user) throws Exception {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		userService.save(user);
		return user.getName();
	}

	@GetMapping("/user")
	List<User> getAllUsers(){
		return userService.getAllUser();
	}
}
