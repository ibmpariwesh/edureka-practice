package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
public class UserController {
	@PostMapping("/user")
	String createUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return user.getName();
	}
}
