package com.ecommerce.service;

import com.ecommerce.model.User;

public interface UserService {

	String registerUser(User user);
	
	User login(String email, String password);
	
	String resetPassword(String email, String newPassword, String ConfirmPassword);
}
