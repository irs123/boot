package com.community.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.community.model.Post;

public class PostDaoImp implements postDao {
	@PersistenceContext
	private EntityManager entityManager;	
	
	@Override
	public List<Post> getAllPost() {
		
		String hql = "FROM Article as atcl ORDER BY atcl.articleId";
		return (List<Post>) entityManager.createQuery(hql).getResultList();	
	}

	@Override
	public Post getPostById(int postId) {
		return entityManager.find(Post.class, postId);
	}

	@Override
	public void addPost(Post post) {
		entityManager.persist(post);
		
	}

}
