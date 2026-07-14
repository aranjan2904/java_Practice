package com.ecommerce.repository;

import java.util.List;

import com.ecommerce.model.User;

public interface UserRepository {
	
	void save(User user);
	
	User findByEmail(String email);
	
	List<User> findAll();
	
	boolean updatePassword(String email, String newPassword);
	

}
