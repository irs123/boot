package com.community.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.community.dao.postDao;
import com.community.model.Post;

public class PostServiceImp implements postDao{
	@Autowired
	private postDao postdaoref;

	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return postdaoref.getAllPost();
	}

	@Override
	public Post getPostById(int postId) {
		Post obj = postdaoref.getPostById(postId);
		return obj;
	}

	@Override
	public void addPost(Post post) {
		/*if (postdaoref.articleExists(postdaoref.getTitle(), postdaore.getCategory())) {
            System.out.println("Error");
        } else {
            articleDAO.addArticle(article);
            return true;
        }	*/	
	
	postdaoref.addPost(post);
	
	}
	
	

}
