package com.project.pharmacine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacine.model.ProductModel;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel,Integer>
{
    

}
