package com.example.spring.commentservice.service;

import java.util.List;

import com.example.spring.commentservice.model.Comments;

public interface CommentService {
	public List<Comments> showAllComments();
	public Comments addComment(Comments comment);
	public List<Comments> getAllCommentsByPid(int pid);
}
