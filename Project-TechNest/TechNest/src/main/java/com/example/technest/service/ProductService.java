package com.example.technest.service;

import com.example.technest.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProductsByCategoryId(int categoryId);
}
