package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.payment.pojo.Payment;

@Configuration      // Equivalent to <beans>...</beans>
public class SpringConfig {

    @Bean("pay1")    // Equivalent to <bean id="pay1">
    public Payment createPayment() {

        Payment payment = new Payment();
        payment.setPaymentRefNo("Ref4235");
        payment.setStatus("PAID");

        return payment;
    }

    @Bean("pay2")    // Equivalent to <bean id="pay2">
    public Payment createPayment2() {

        Payment payment = new Payment();
        payment.setPaymentRefNo("Ref42545454");
        payment.setStatus("HOLD");

        return payment;
    }
}