package com.example.technest.controller;

import com.example.technest.entity.Users;
import com.example.technest.service.UsersService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TechNestController {

    public final UsersService usersService;

    public TechNestController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/")
    public String showHome()
    {
     return "home";
    }

    @GetMapping("/login")
    public String showLoginPage()
    {
        return "login";
    }

    @GetMapping("/user")
    public String userPage(){
        return "User_DashBoard";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "Admin_DashBoard";
    }
    @GetMapping("/accessdenied")
    public String accessDenied(){
        return "accessdenied";
    }



    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("users", new Users());

        return "signup";
    }

    @PostMapping("/register")
    public String processSignupForm(@Valid @ModelAttribute("users") Users users, BindingResult bindingResult, RedirectAttributes redirectAttributes)
    {
        //System.out.println("0");
        if (bindingResult.hasErrors()) {
            bindingResult.getFieldErrors().forEach(error -> {
                        System.out.println("Field: " + error.getField() + ", Error: " + error.getDefaultMessage());
            //System.out.println("1");

            });
            return "signup";
        }
        // Save user to the database

        users.setPassword("{noop}"+users.getPassword());
        //System.out.println("2");
        usersService.save(users);
        //System.out.println("3");
        redirectAttributes.addFlashAttribute("successMessage", "Registration successful! Please log in.");
        return "redirect:/login";
    }

//    @GetMapping("/dashboard")
//    public String showDashboard()
//    {
//        return "Admin_DashBoard";
//    }

    @GetMapping("/users")
    public String showUsers()
    {
        System.out.println("1000");
        return "Admin_User_List";
    }

}
