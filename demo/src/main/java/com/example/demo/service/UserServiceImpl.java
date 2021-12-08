package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
@Service
public class UserServiceImpl implements IUserService{

	@Override
	public String save(User user) {
		System.out.println(user.getAge());
		return user.getName();
	}
}
