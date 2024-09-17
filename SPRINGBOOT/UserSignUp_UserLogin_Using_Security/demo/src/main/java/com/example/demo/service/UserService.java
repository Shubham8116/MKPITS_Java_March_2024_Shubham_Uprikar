package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repo.RoleRepository;
import com.example.demo.repo.UserRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    //    @Autowired
//    private PasswordEncoder passwordEncoder;
    @Transactional
    public void registerUser(User user) {

        // Encrypt the password before saving the user
        //user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Assign the "ROLE_USER" by default
//        Role userRole = roleRepository.findByName("ROLE_USER");
//        user.setRoles(new HashSet<>());
//        user.getRoles().add(userRole);

        HashSet<Role> rolesa=new HashSet<>();
        Role roles=roleRepository.findByName("ROLE_USER");
        rolesa.add(roles);
        user.setRoles(rolesa);

        // Save the user
        userRepository.save(user);




    }
}
