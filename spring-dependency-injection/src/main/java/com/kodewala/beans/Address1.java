package com.kodewala.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address1 {
	@Value("nimiya")
	private String line1;
	@Value("byepass")
	private String line2;
	@Value("daltonganj")
	private String city;
	@Value("Jharkhand")
	private String state;
	
	

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
