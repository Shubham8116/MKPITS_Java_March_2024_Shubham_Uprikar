package com.example.technest.service;

import com.example.technest.entity.Product;
import com.example.technest.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getProductsByCategoryId(int categoryId) {
        return productRepo.findByCategoryId(categoryId);
    }
}
