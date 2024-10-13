package com.example.technest.service;

import com.example.technest.entity.Users;
import com.example.technest.entity.UsersDetails;
import com.example.technest.repo.UsersDetailsRepo;
import com.example.technest.repo.UsersRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class AdminDisplayUsersServiceImpl implements AdminDisplayUsersService{

    @Autowired
    private final UsersRepo usersRepo;
    private final UsersDetailsRepo usersDetailsRepo;

    public AdminDisplayUsersServiceImpl(UsersRepo usersRepo, UsersDetailsRepo usersDetailsRepo) {
        this.usersRepo = usersRepo;
        this.usersDetailsRepo = usersDetailsRepo;
    }

    @Override
    public Page<Users> getUsers(int page, int size) {
        return usersRepo.findAll(PageRequest.of(page, size));
    }

    @Override
    public UsersDetails getUserDetailsByUsersId(int usersId) {
        return usersDetailsRepo.findByUsersId(usersId).orElse(null);
    }

    @Override
    @Transactional
    public void saveDetails(UsersDetails usersDetails) {
        usersDetailsRepo.save(usersDetails);

    }

    @Override
    @Transactional
    public void deleteUserAndDetails(int userId) {
        // Delete user details first
        usersDetailsRepo.deleteByUsersId(userId);
        // Then delete the user
        usersRepo.deleteById(userId);;

    }
}
