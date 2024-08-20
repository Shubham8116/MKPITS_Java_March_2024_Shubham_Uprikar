package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/main", method=RequestMethod.GET)
public class MyController {
    @Value("${company.name}")
    private String companyname;

    @GetMapping("/show")

    public String sayHello() {
        return "Hello " + companyname;
    }

}
