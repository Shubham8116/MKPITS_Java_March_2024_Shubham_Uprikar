package com.example.technest.controller;

import com.example.technest.entity.Product;
import com.example.technest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/television")
    public String getTelevisionProducts(Model model) {
        // 1 is the category ID for televisions
        List<Product> products = productService.getProductsByCategoryId(1);
        model.addAttribute("products", products);
        System.out.println(1);
        return "television";
    }

    @GetMapping("/refrigerator")
    public String getRefrigeratorProducts(Model model) {
        System.out.println(10);
        // 2 is the category ID for refrigerators
        List<Product> products = productService.getProductsByCategoryId(2);
        System.out.println(20);

        model.addAttribute("products", products);
        System.out.println(2);
        return "refrigerator";
    }

    @GetMapping("/washing-machine")
    public String getWashingMachineProducts(Model model) {
        // 3 is the category ID for washing machines
        List<Product> products = productService.getProductsByCategoryId(3);
        model.addAttribute("products", products);
        System.out.println(3);
        return "washing_machine";
    }

    @GetMapping("/geyser")
    public String getGeyserProducts(Model model) {
        List<Product> products = productService.getProductsByCategoryId(4); // Assuming 5 is the category ID for geysers
        model.addAttribute("products", products);
        System.out.println(4);
        return "geyser";
    }

    @GetMapping("/purifier")
    public String getPurifierProducts(Model model) {
        // 4 is the category ID for purifiers
        List<Product> products = productService.getProductsByCategoryId(5);
        model.addAttribute("products", products);
        return "water_purifier";
    }

    @GetMapping("/air-conditioner")
    public String getAirConditionerProducts(Model model) {
        // 6 is the category ID for air conditioners
        List<Product> products = productService.getProductsByCategoryId(6);
        model.addAttribute("products", products);
        return "air_conditioner";
    }



}
