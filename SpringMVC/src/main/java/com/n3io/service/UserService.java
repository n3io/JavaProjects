package com.n3io.service;

import java.util.List;

import com.n3io.model.Users;

public interface UserService {
	public List<Users> list();
	public boolean delete(Users users);
	public boolean saveOrUpdate(Users users);
}
