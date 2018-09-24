package com.in28minutes.learning.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Table - User

@Entity
@Table (name="User")
public class User {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

}
