package com.wesleycoelho.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesleycoelho.workshopmongo.domain.Post;
import com.wesleycoelho.workshopmongo.domain.User;
import com.wesleycoelho.workshopmongo.repository.PostRepository;
import com.wesleycoelho.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;	
	
	
	public Post findById(String id) {
	    Optional<Post> post = repo.findById(id);
		if(post.isEmpty() ) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		return post.get();
	}
	
	
}
