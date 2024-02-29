package com.project.pharmacine.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacine.model.BillDetail;
import com.project.pharmacine.repository.BillDetailRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class BillDetailController {
    @Autowired
    BillDetailRepo billDetailRepo;

    @PostMapping("/bill/post")
    public BillDetail postMethodName(@RequestBody BillDetail entity) {
        return billDetailRepo.save(entity);
    }

    @GetMapping("/bill/get/{billno}")
    public List<BillDetail> getBillDetailsByCustomerId(@PathVariable int billno) {
        return billDetailRepo.findByCustomerInfoId(billno);
    }


    @GetMapping("/bill/get/sort/{billno}")
    public Page<BillDetail> getBillDetailsByCustomerIdSort(@PathVariable int billno, Pageable pageable) {
        return billDetailRepo.findByCustomerInfoId(billno, pageable);
    }

}
