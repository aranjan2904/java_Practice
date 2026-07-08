package com.rapido.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/dologin")
	public String login() {
		System.out.println("LoginController.login()");
		return "login-page";
	}
}
