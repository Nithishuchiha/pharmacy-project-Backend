package com.project.pharmacine.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacine.model.SignUpModel;
import com.project.pharmacine.service.AppService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.project.pharmacine.model.BillModel;
import com.project.pharmacine.service.BillService;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
public class AppContoller {
    @Autowired
    AppService appService;

    
    @PostMapping("/post")
    public SignUpModel postMethodName(@RequestBody SignUpModel entity) {
        
        appService.signUpPost(entity);
        return entity;
    }
    @GetMapping("/getAll")
    public List<SignUpModel> getALL() {
        return appService.signInGet();
    }
    
    @GetMapping("/getOne/{id}")
    public SignUpModel getone(@PathVariable int id) {
        return appService.signInGetOne(id);
    }
    @PutMapping("update/{id}")
    public SignUpModel putMethodName(@PathVariable int id, @RequestBody SignUpModel entity) {
        
        appService.update(id,entity);
        return entity;
    }




    @Autowired
    private BillService pharmaService;

    @PostMapping("/bill")
    public BillModel addPharmaModel(@RequestBody BillModel Bil)
    {
        pharmaService.savePharma(Bil);
        return Bil;
    }
    @GetMapping("/getbill")
    public List<BillModel> getMedicine()
    {
        return pharmaService.getPharma();
    }
    @GetMapping("/searchid/{id}")
    public Optional<BillModel> search(@PathVariable int id)
    {
        return pharmaService.searchId(id);
    }

    @DeleteMapping("/delete/{id}")
    public void getDeleteId(@PathVariable("id") int id)
    {
        pharmaService.delId(id);
    }
    
}
