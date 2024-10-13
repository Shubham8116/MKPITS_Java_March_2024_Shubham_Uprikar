package com.example.technest.controller;

import com.example.technest.entity.Users;
import com.example.technest.entity.UsersDetails;
import com.example.technest.service.AdminDisplayUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminDashboardController {
    @Autowired
    AdminDisplayUsersService adminDisplayUsersService;

    @GetMapping("/admin/users")
    public String getUsers(Model model, @RequestParam(defaultValue = "0") int page) {
        Page<Users> usersPage = adminDisplayUsersService.getUsers(page, 10);
        model.addAttribute("usersPage", usersPage);
        return "Admin_User_List";
    }






    @GetMapping("/admin/users/view/{id}")
    public String viewUser(@PathVariable int id, Model model) {
        UsersDetails usersDetails = adminDisplayUsersService.getUserDetailsByUsersId(id);
        model.addAttribute("userdetails", usersDetails);
        return "Admin_User_View";
    }

    @GetMapping("/admin/users/update/{id}")
    public String showUpdateForm(@PathVariable int id, Model model) {
        UsersDetails userDetails = adminDisplayUsersService.getUserDetailsByUsersId(id);
        model.addAttribute("userDetails", userDetails);
        return "Admin_User_Update_Form";
    }

    @PostMapping("/admin/users/update/{id}")
    public String updateUser(@PathVariable int id, @ModelAttribute("userDetails") UsersDetails userDetails) {
        UsersDetails existingUserDetails = adminDisplayUsersService.getUserDetailsByUsersId(id);
        if (existingUserDetails != null) {
            existingUserDetails.setPhone(userDetails.getPhone());
            existingUserDetails.setDob(userDetails.getDob());
            existingUserDetails.setCity(userDetails.getCity());
            existingUserDetails.setStreet(userDetails.getStreet());
            existingUserDetails.setState(userDetails.getState());
            existingUserDetails.setPinCode(userDetails.getPinCode());
            // Update other fields as necessary
            adminDisplayUsersService.saveDetails(existingUserDetails);
        }
        return "redirect:/admin/users";
    }

//    @PostMapping("/admin/users/update/{id}")
//    public String updateUser(@PathVariable int id, Model model) {
//        User user = userService.getUserById(id);
//        model.addAttribute("user", user);
//        return "admin/updateUser";
//    }

    @GetMapping("/admin/users/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        adminDisplayUsersService.deleteUserAndDetails(id);
        return "redirect:/admin/users";
    }




}
