package com.n3io.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Integer user_id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="user_email")
	private String email;

	public String getEmail() {
		return email;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	
	
	
}
