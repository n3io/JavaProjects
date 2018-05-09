package com.n3io.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.n3io.rest.webservices.restfulwebservices.exception.UserAlreadyExistException;
import com.n3io.rest.webservices.restfulwebservices.post.Post;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	private static int usersCount = 3;

	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "Jack", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);

		} else if (findOne(user.getId()) != null) {
			throw new UserAlreadyExistException("Id-" + user.getId());
		}

		users.add(user);
		return user;
	}

	public User findOne(int id) {
		User user = users.stream()
				.filter(u -> u.getId() == id)
				.findAny().
				orElse(null);
		
		return user;

	}

	public User deleteById(int id) {
		User user = findOne(id);
		
		if (user != null)
			users = users.stream()
			.filter(u -> u.getId() != id)
			.collect(Collectors.toList());

		return user;

	}

	public List<Post> getAllPostsByUser(int userId) {
		return findOne(userId).getPosts();
	}

}
