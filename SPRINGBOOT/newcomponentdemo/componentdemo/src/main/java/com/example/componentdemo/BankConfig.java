package com.example.componentdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {
    @Bean
    public Account loanAccount()
    {
        return new LoanAccount();
    }
}
