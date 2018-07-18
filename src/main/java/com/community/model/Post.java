package com.community.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post {
	@Id
	private int postID;
	private String title;
	private String category;
	
	public int getPostID() {
		return postID;
	}
	public void setPostID(int postID) {
		this.postID = postID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
