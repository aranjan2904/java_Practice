package com.ecommerce.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	private List<User> users = new ArrayList<User>();

	@Override
	public void save(User user) {
		users.add(user);
	}

	@Override
	public User findByEmail(String email) {
		
		for(User user : users) {
			
			if(user.getEmail().equals(email)) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public List<User> findAll() {
		
		return users;
	}

	@Override
	public boolean updatePassword(String email, String newPassword) {
		
		User user  = findByEmail(email);
		
		if(user != null) {
			
			user.setPassword(newPassword);
			user.setConfirmPassword(newPassword);
			
			return true;
		}
		return false;
	}
	
	

}
