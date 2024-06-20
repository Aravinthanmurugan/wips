package com.example.service;

import com.example.model.User;

public interface UserService {
	public boolean validateUser(User user);

	public User registerUser(User user);
}
