package com.project.pharmacine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacine.model.ProductModel;
import com.project.pharmacine.repository.ProductRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {
    @Autowired
    ProductRepo productRepo;
    @PostMapping("/product/post")
    public ProductModel postMethodName(@RequestBody ProductModel entity) {

        return productRepo.save(entity);
    }
    
}
