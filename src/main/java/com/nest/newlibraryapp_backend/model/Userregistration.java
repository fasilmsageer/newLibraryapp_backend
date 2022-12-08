package com.nest.newlibraryapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userregistration")

public class Userregistration {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String aadharnumber;
    private String address;
    private String pincode;
    private String dob;
    private String email;
    private String phonenumber;
    private String username;
    private String password;
    private String confirmpassword;

    public Userregistration(){}

    public Userregistration(int id, String name, String aadharnumber, String address, String pincode, String dob, String email, String phonenumber, String username, String password, String confirmpassword) {
        this.id = id;
        this.name = name;
        this.aadharnumber = aadharnumber;
        this.address = address;
        this.pincode = pincode;
        this.dob = dob;
        this.email = email;
        this.phonenumber = phonenumber;
        this.username = username;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharnumber() {
        return aadharnumber;
    }

    public void setAadharnumber(String aadharnumber) {
        this.aadharnumber = aadharnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
}

