package com.blogger5.conroller;

import com.blogger5.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
public class PostConroller {
    PostService postService;

    public PostConroller(PostService postSerice) {
        this.postService = postSerice;
    }
@DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable long id){
    postService.deleteById(id);
    return new ResponseEntity<>("Post is deleted", HttpStatus.OK);
    }
    
}
