package com.n3io.rest.webservices.restfulwebservices.post;

import java.util.Date;

public class Post {


	private Integer id;

	private String post;
	
	private Date postdate;

	
	public Post() {
		super();
		
	}

	public Post(Integer id, String post, Date postdate) {
		super();
		this.id = id;
		this.post = post;
		this.postdate = postdate;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPost() {
		return post;
	}


	public void setPost(String post) {
		this.post = post;
	}


	public Date getPostdate() {
		return postdate;
	}


	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", post=" + post + ", postdate=" + postdate + "]";
	} 
	
}
