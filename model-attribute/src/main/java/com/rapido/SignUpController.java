package com.rapido;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rapido.request.SignUpRequest;

@Controller
public class SignUpController {
	
	@PostMapping("/signup")
	public String doSignUp(@ModelAttribute SignUpRequest request, Model model) {
		
		System.out.println("first name : " + request.getFirstName());
		System.out.println("last name : " + request.getLastName());
		System.out.println("email : " + request.getEmail());
		System.out.println("phone : " + request.getPhone());
		
		String userId = "4332234";
		
		model.addAttribute("user", userId);
		
		return "signup-sucess";
	}

}
