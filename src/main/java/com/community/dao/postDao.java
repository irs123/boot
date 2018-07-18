package com.community.dao;

import java.util.List;

import com.community.model.Post;

public interface postDao {
	
	List<Post> getAllPost();
	Post getPostById(int postId);
	void addPost(Post post);
}
