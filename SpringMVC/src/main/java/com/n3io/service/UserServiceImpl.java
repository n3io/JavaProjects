package com.n3io.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n3io.model.Users;
import com.n3io.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<Users> list() {
		return userRepository.list();
	}

	public boolean delete(Users users) {
		return userRepository.delete(users);
	}

	public boolean saveOrUpdate(Users users) {
		return userRepository.saveOrUpdate(users);
	}

}
