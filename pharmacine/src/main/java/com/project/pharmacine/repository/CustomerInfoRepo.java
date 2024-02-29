package com.project.pharmacine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacine.model.CustomerInfo;

@Repository
public interface CustomerInfoRepo extends JpaRepository<CustomerInfo,Integer>{
    
}
