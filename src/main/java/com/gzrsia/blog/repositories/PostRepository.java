package com.gzrsia.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gzrsia.blog.entities.Post;

// Works with the Post class.

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
