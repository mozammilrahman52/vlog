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
public class PostController {


    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    //http:localhost:8080/api/post
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable long id) {
        postService.deleteById(id);
        return new ResponseEntity<>("Post is deleted", HttpStatus.OK);

    }
    //http:localhost:8080/api/post/1
    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable ("id") long id){
        PostDto dto = postService.getPostById(id);
        return new ResponseEntity(dto,HttpStatus.OK);
    }


        //http://localhost:8080/api/post
        @PostMapping
        public ResponseEntity<PostDto> saveDto (@RequestBody PostDto postDto){
            PostDto dto = postService.savePost(postDto);
            return new ResponseEntity<>(dto, HttpStatus.CREATED);//201
        }



}










