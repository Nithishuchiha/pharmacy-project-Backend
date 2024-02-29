package com.project.pharmacine.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacine.model.ProductModel;
import com.project.pharmacine.repository.ProductRepo;

@Service
public class ProductService 
{
    @Autowired
    private ProductRepo pharmaRepo;
    public ProductService(ProductRepo pharmaRepo)
    {
        this.pharmaRepo=pharmaRepo;
    }


    public ProductModel savePharma(ProductModel pharmaModel)
    {
        pharmaRepo.save(pharmaModel);
        return pharmaModel;
    }


    
    public List<ProductModel> getPharma()
    {
        return pharmaRepo.findAll();
    }



    public Optional<ProductModel> searchId(int id)
    {
        return pharmaRepo.findById(id);
    }

    
    public void delId(int id)
    {
        pharmaRepo.deleteById(id);;
    }
}
