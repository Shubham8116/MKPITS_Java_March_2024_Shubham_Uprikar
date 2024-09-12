//Controller to handle requests
package com.example.spring_security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    //mapping for Home page
    @GetMapping("/")
    public String showHome() {

        return "home";
    }
    //Mapping for employee page
    @GetMapping("/employee")
    public String showemployee()
    {

        return "employee_page";
    }
    //Mapping for manager page
    @GetMapping("/manager")
    public String showmanager()
    {
        return "manager_page";

    }
    //Mapping for admin page
    @GetMapping("/admin")
    public String showadmin()
    {
        return "admin_page";

    }
    //Mapping for login page
    @GetMapping("/login")
    public String showloginpage()
    {
        return "login";

    }
    @GetMapping("/accessdenied")
    public String showError() {

        return "access_denied";
    }

}
