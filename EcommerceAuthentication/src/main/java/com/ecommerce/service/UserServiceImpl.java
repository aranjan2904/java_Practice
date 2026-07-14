package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public String registerUser(User user) {
		
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			return "password do not match";
		}
		
		User existingUser =  userRepository.findByEmail(user.getEmail());
		
		if(existingUser != null) {
			return "Email already exist";
		}
		
		userRepository.save(user);
		
		return "Registration successfull";
	}

	@Override
	public User login(String email, String password) {

	    User user = userRepository.findByEmail(email);

	    if(user == null) {

	        return null;

	    }

	    if(user.getPassword().equals(password)) {

	        return user;

	    }

	    return null;

	}

	@Override
	public String resetPassword(String email,
	                            String newPassword,
	                            String confirmPassword) {

	    if(!newPassword.equals(confirmPassword)) {

	        return "Passwords do not match";

	    }

	    boolean updated =
	            userRepository.updatePassword(email,
	                                          newPassword);

	    if(updated) {

	        return "Password Updated Successfully";

	    }

	    return "Email Not Found";

	}

}
