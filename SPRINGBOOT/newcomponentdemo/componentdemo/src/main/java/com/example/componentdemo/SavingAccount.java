package com.example.componentdemo;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SavingAccount implements Account{

    public SavingAccount()
    {
        System.out.println("loan account constructor");

    }


    @Override
    public String getDetails() {
        return "Hello sanved";
    }
}
