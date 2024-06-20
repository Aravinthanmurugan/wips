
package com.example.spring.dataservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.dataservice.model.CommentsDto;
import com.example.spring.dataservice.model.Posts;
import com.example.spring.dataservice.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostContoller {
	
	@Autowired
	PostService service;
	
	@GetMapping("/commnetsPort")
	public String getPorts() {
		return service.getCommentsPort();
	}
	
	@GetMapping("/getComments/{pid}")
	public List<CommentsDto> getCommentsForPid(@PathVariable int pid){
		return service.getAllComments(pid);
	}
	
	@GetMapping
	public List<Posts> showAllPosts(){
		return service.getAllPosts();
	}

	@PostMapping
	public Posts addPost(@RequestBody Posts post) {
		return service.addPost(post);
	}
}
