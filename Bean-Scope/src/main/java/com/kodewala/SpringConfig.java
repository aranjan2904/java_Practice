package com.kodewala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Payment createPayment() {
		
		return new Payment();
	}
	
	
}
