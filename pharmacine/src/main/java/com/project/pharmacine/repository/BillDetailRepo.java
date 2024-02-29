package com.project.pharmacine.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.project.pharmacine.model.BillDetail;

@Repository
public interface BillDetailRepo extends JpaRepository<BillDetail,Integer>{
     List<BillDetail> findByCustomerInfoId(int customerInfoId);
     Page<BillDetail> findByCustomerInfoId(int customerInfoId, Pageable pageable);

}
