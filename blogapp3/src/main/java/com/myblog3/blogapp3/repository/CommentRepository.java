package com.myblog3.blogapp3.repository;

import com.myblog3.blogapp3.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
   List<Comment> findByPostId(long postId);

}
