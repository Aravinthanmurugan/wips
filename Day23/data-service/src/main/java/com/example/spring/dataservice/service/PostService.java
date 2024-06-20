package com.example.spring.dataservice.service;



import java.util.List;



import com.example.spring.dataservice.model.CommentsDto;
import com.example.spring.dataservice.model.Posts;


public interface PostService {
	
	public List<Posts> getAllPosts();
	public Posts addPost(Posts post);
    public List<CommentsDto> getAllComments(int pid);
    public String getCommentsPort();

}
