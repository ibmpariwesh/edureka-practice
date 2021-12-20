package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	UserRepository repository;

	@Override
	@Transactional(rollbackOn = Exception.class)
	public String save(User user) throws Exception {
		System.out.println(user.getAge());
		repository.save(user);
		if(1 == 1)
			throw new Exception();
		return user.getName();
	}

	@Override
	public List<User> getAllUser() {
		return repository.findAll();
	}
}
