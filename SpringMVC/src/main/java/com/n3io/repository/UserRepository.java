package com.n3io.repository;

import java.util.List;

import com.n3io.model.Users;

public interface UserRepository {

	public List<Users> list();
	public boolean delete(Users users);
	public boolean saveOrUpdate(Users users);
	
}
