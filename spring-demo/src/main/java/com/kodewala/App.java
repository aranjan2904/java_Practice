package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.bean.Account;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		
		Account account = (Account) container.getBean("acc");
		
		account.printSomething();
	}
}

