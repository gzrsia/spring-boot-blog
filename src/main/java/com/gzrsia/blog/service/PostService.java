package com.gzrsia.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzrsia.blog.entities.Post;
import com.gzrsia.blog.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}
	
	public void insert(Post post) {
		postRepository.save(post);
	}
	
}
