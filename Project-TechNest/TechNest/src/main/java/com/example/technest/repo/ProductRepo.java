package com.example.technest.repo;

import com.example.technest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    List<Product> findByCategoryId(int categoryId);
}
