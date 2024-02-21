package com.project.pharmacine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacine.model.BillModel;




@Repository
public interface BillRepo extends JpaRepository<BillModel,Integer>
{
    

}
