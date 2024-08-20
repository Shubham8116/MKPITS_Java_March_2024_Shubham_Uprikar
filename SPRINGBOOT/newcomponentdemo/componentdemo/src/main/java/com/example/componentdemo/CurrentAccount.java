package com.example.componentdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CurrentAccount implements Account{

    public CurrentAccount() {
        System.out.println("current account constructor");

    }

    @Override
    public String getDetails() {
        return "This is current account";
    }
}
