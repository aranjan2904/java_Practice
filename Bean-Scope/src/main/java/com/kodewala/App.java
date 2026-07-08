package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new  AnnotationConfigApplicationContext(SpringConfig.class);
        
         Payment payment = (Payment) context.getBean("payment");
         
         System.out.println(payment.getPaymentId());
        
    }
}
