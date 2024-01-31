package com.myblog3.blogapp3.repository;

import com.myblog3.blogapp3.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
