package com.springCore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ci/ciConfig.xml");
		  
		   Person p = (Person) context.getBean("person");
		   
		  System.out.println(p);
	}
}
