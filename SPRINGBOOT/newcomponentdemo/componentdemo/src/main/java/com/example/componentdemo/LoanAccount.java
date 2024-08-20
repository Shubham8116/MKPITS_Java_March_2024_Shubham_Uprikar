package com.example.componentdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LoanAccount implements Account{

    public LoanAccount() {
        System.out.println("loan account constructor");
    }

    @PostConstruct
    public void showPostConstruct()
    {
//        return "this is postconstruct";
        System.out.println("this is postconstruct");
    }


    @PreDestroy
    public void showPreDestroy() {
//        return "this is pre destroy";
        System.out.println("this is pre destroy");
    }

    @Override
    public String getDetails() {
        return "this is loan account";
    }
}
