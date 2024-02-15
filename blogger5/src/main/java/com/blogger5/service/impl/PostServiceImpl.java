package com.blogger5.service.impl;

import com.blogger5.Exception.ResourceNotFoundException;
import com.blogger5.entity.Post;
import com.blogger5.payload.PostDto;
import com.blogger5.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
 class PostServiceImpl {

 }
//    private PostRepository postRepository;
//
//    @Autowired
//    public PostServiceImpl(PostRepository postRepository){
//        this.postRepository=postRepository;
//    }

//    @Override
//    public ResponseEntity<PostDto> getPostById(Long id ) {
//        try {
//            Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("post is not found with id:" + id));
//
//
//        } catch (ResourceNotFoundException e) {
//
//
//            return null;
//        }
//
//
//    }
//}
