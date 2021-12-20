package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface IUserService {
	String save(User user);

	List<User> getAllUser();
}
