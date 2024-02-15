package com.blogger5.conroller;

import com.blogger5.service.PostService;
import com.blogger5.payload.PostDto;
import com.blogger5.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
public class PostConroller {


private PostService postService;

@Autowired
public PostController(PostService postService){
    this.postService=postService;
}


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable long id){
    postService.deleteById(id);
    return new ResponseEntity<>("Post is deleted", HttpStatus.OK);


    @GetMapping ("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable Long id){
       PostDto post = postService.getPostById(id);
        return new ResponseEntity<>(post, HttpStatus.OK);

    }

}
