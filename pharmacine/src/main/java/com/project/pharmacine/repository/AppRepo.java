package com.project.pharmacine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacine.model.SignUpModel;

@Repository
public interface AppRepo extends JpaRepository<SignUpModel,Integer>{
    
}
