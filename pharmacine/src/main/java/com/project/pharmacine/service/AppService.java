package com.project.pharmacine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacine.model.SignUpModel;
import com.project.pharmacine.repository.AppRepo;
@Service
public class AppService {

    @Autowired
    AppRepo appRepo;


    public SignUpModel signUpPost(SignUpModel entity)
    {
        appRepo.save(entity);
        return entity;
    }
    
    
    public List<SignUpModel> signInGet()
    {
        return appRepo.findAll();
        
    }


    public SignUpModel signInGetOne(int id)
    {
        return appRepo.findById(id).orElse(null);
        
    }
    public SignUpModel update(int id,SignUpModel entity)
    {
        entity.setId(id);
        appRepo.save(entity);
        return entity;
        
    }
    
}
