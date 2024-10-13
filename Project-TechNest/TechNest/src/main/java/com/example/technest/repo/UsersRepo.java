package com.example.technest.repo;

import com.example.technest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users,Integer> {
}
