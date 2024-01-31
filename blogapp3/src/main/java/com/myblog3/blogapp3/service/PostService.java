package com.myblog3.blogapp3.service;

import com.myblog3.blogapp3.payload.PostDto;
import com.myblog3.blogapp3.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int PageNo, int PageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePost(long id);
}
