package com.kodewala.payment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.SpringConfig;
import com.kodewala.payment.pojo.Payment;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Payment payment = (Payment) context.getBean("pay1");
        
        payment.printPaymentDetails();
        
        
    }
}
	