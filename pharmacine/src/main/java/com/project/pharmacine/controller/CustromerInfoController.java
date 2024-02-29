package com.project.pharmacine.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacine.model.CustomerInfo;
import com.project.pharmacine.repository.CustomerInfoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CustromerInfoController {
    @Autowired
    CustomerInfoRepo customerInfoRepo;
    @PostMapping("/customerInfo/post")
    public CustomerInfo postMethodCustomer(@RequestBody CustomerInfo entity) {
        return customerInfoRepo.save(entity);
    }
    
}
