package com.example.databindingdemo.controller;

import com.example.databindingdemo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//home url mapping
public class StudentController {
    @GetMapping("/")
    public String sayHello()
    {


        return "welcome";
    }

//mapping for showform to enter the student data
    @GetMapping("/showform")
    public String showform(Model model)
    {
        model.addAttribute("student",new Student());
        return "showform";
    }

//mapping processform to retrieve data from form and forward view to displaydata page
    @PostMapping("/processform")
    public String processform(@ModelAttribute("student") Student theStudent)
    {
        System.out.println(theStudent);

        return "displaydata";
    }

}
