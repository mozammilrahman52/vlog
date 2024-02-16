package com.blogger5.service;
import com.blogger5.payload.PostDto;
public interface PostService {
    void deleteById(long id);

    PostDto getPostById(long id);


    void getAllPost();
}
