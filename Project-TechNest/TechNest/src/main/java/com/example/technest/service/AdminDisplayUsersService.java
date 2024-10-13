package com.example.technest.service;

import com.example.technest.entity.Users;
import com.example.technest.entity.UsersDetails;
import org.springframework.data.domain.Page;


public interface AdminDisplayUsersService {

     Page<Users> getUsers(int page, int size);
     UsersDetails getUserDetailsByUsersId(int usersId);
     void saveDetails(UsersDetails usersDetails);
     void deleteUserAndDetails(int id);

}
