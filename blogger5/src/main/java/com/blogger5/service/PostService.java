package com.blogger5.service;
import com.blogger5.payload.PostDto;
public interface PostService {
    void deleteById(long id);


public interface PostService {

    PostDto getPostById(Long id);
}
}
