package com.ecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.model.User;
import com.ecommerce.service.UserService;


@Controller
public class UserController {
	
	 @Autowired
	 private UserService userService;
	
	 //-------------------------
	 
	 
	@GetMapping("/signup")
	public String openSignupPage() {
		
		return "signup";
	}
	
	//------------------------------
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user, Model model) {

	    String message = userService.registerUser(user);

	    model.addAttribute("message", message);

	    return "signup-success";
	}
	//------------------------------
	
	@GetMapping("/login")
	public String openLoginPage() {
		
		return "login";
	}
	
	//---------------------------------
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
		
		User user =  userService.login(email, password);
		
		if(user != null) {
			model.addAttribute("user" ,user);
			
			return "welcome";
		}
		
		
		model.addAttribute("message", "invalid email or password");
		
		return "login";
	}
	
	//----------------------------------
	
	@GetMapping("/reset")

	public String openResetPage() {

	    return "reset";

	}
	
	//----------------------------
	
	@PostMapping("/resetPassword")

	public String resetPassword(

	@RequestParam("email") String email,

	@RequestParam("newPassword") String newPassword,

	@RequestParam("confirmPassword") String confirmPassword,

	Model model) {

	    String message =
	            userService.resetPassword(email,
	                                      newPassword,
	                                      confirmPassword);

	    model.addAttribute("message",
	                       message);

	    return "reset-success";

	}
	
}
