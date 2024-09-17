package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public String showSignUpPage(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        user.setPassword("{noop}"+user.getPassword());
        userService.registerUser(user);
        return "redirect:/login?success";
    }


    @GetMapping("/login")
    public String showLoginPage(){
        return "login";
    }
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/user")
    public String userPage(){
        return "user";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "admin";
    }
    @GetMapping("/accessdenied")
    public String accessDenied(){
        return "access-denied";
    }
}
