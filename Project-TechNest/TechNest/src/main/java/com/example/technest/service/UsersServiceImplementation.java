package com.example.technest.service;

import com.example.technest.entity.Role;
import com.example.technest.entity.Users;
import com.example.technest.entity.UsersDetails;
import com.example.technest.repo.RoleRepo;
import com.example.technest.repo.UsersDetailsRepo;
import com.example.technest.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;

@Service
public class UsersServiceImplementation implements UsersService{

    @Autowired
    public final UsersRepo usersRepo;
    @Autowired
    public final UsersDetailsRepo usersDetailsRepo;
    @Autowired
    public final RoleRepo roleRepo;

    public UsersServiceImplementation(UsersRepo usersRepo, UsersDetailsRepo usersDetailsRepo, RoleRepo roleRepo) {
        this.usersRepo = usersRepo;
        this.usersDetailsRepo = usersDetailsRepo;
        this.roleRepo = roleRepo;
    }


    @Override
    @Transactional
    public Users save(Users users) {
        System.out.println("4");

        HashSet<Role> rolesSet=new HashSet<>();
        Role roles=roleRepo.findByRoleName("ROLE_USER");
        rolesSet.add(roles);
        users.setRoles(rolesSet);

//        // Save Users_Details first
//        UsersDetails details = usersDetailsRepo.save(users.getUsersDetails());
//        users.setUsersDetails(details);
//        System.out.println("5");
//        // Now save student
//
//        return usersRepo.save(users);


        // Save UsersDetails first then users
        //1) get users details from user and save in details
        UsersDetails details = users.getUsersDetails();
        //2)now we have to set users which we have created in UserDetails entity
        details.setUsers(users); // Ensure the bidirectional relationship is set
        //3) now save userdetails using JPA repo
        usersDetailsRepo.save(details);

         // 4) now we have to set userdetails of users class which we have created in Users entity
        users.setUsersDetails(details); // This line ensures the relationship is maintained
        // 5) now save users using JPA repo
        return usersRepo.save(users);


    }
}
