package com.project.pharmacine.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pharmacine.model.BillModel;
import com.project.pharmacine.repository.BillRepo;

@Service
public class BillService 
{
    @Autowired
    private BillRepo pharmaRepo;
    public BillService(BillRepo pharmaRepo)
    {
        this.pharmaRepo=pharmaRepo;
    }


    public BillModel savePharma(BillModel pharmaModel)
    {
        pharmaRepo.save(pharmaModel);
        return pharmaModel;
    }


    
    public List<BillModel> getPharma()
    {
        return pharmaRepo.findAll();
    }



    public Optional<BillModel> searchId(int id)
    {
        return pharmaRepo.findById(id);
    }

    
    public void delId(int id)
    {
        pharmaRepo.deleteById(id);;
    }
}
