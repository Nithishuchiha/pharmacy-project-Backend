package com.project.pharmacine.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class CustomerInfo {
    @Id
    private int id;
    private String phn;
    private String customer_name;

    @JsonManagedReference(value = "customerInfo-billDetail")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerInfo")
    private List<BillDetail> billDetails;
}
