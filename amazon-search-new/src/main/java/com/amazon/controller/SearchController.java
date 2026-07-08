package com.amazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {

	@GetMapping("/")
	public String openHomePage() {
	    return "index";
	}

    
    @GetMapping("/about")
    public String openAboutPage() {
    	
    	return "about";
    }
}