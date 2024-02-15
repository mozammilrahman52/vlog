package com.blogger5.service.impl;

import com.blogger5.entity.Post;
import com.blogger5.exception.ResourceNotFound;
import com.blogger5.repository.PostRepository;
import com.blogger5.service.PostService;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @Override
    public void deleteById(long id) {
        try {
            postRepository.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            throw new ResourceNotFound("Post Not Found with id: " + id);
        }
    }
}
