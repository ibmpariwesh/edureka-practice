package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;

@RestController
public class UserController {
	@Autowired
	IUserService userService;

	@PostMapping("/user")
	@ResponseStatus(code = HttpStatus.CREATED)
	Integer createUser(@RequestBody User user) throws Exception {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		userService.save(user);
		return user.getId();
	}

	@PutMapping("/user/{id}")
	void updateUser(@RequestBody User user, @PathVariable Integer id) {
		userService.updateUser(user, id);
	}

	@GetMapping("/user")
	List<User> getAllUsers() {
		return userService.getAllUser();
	}
}
