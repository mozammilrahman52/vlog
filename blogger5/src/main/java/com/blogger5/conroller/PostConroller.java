package com.blogger5.conroller;

import com.blogger5.payload.PostDto;
import com.blogger5.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/create")
 class PostController {
private PostService postService;

@Autowired
public PostController(PostService postService){
    this.postService=postService;
}

    @GetMapping ("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable Long id){
       PostDto post = postService.getPostById(id);
        return new ResponseEntity<>(post, HttpStatus.OK);

    }

}
