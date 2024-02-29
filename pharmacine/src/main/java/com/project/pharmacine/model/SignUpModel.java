package com.project.pharmacine.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SignUpModel {
    @Id
    private int id;
    private String email;
    private String password;
    private String name;
    private String phn;
    public SignUpModel()
    {
        
    }
    public SignUpModel(int id, String email, String password, String name, String phn) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.phn = phn;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhn() {
        return phn;
    }
    public void setPhn(String phn) {
        this.phn = phn;
    }
    
}
