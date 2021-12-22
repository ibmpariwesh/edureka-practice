package com.example.demo.service;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
@Profile("prod")
@Service  //tells spring to treat this class as a spring bean
public class UserServiceImpl2 implements IUserService{

	@Override
	public String save(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user, Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
