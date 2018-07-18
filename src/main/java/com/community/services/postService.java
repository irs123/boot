package com.community.services;

import java.util.List;

import com.community.model.Post;

public interface postService {
	List<Post> getAllPost();
	Post getPostById(int postId);
	void addPost(Post post);

}
