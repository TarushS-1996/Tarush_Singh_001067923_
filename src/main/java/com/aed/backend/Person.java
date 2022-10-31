/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.backend;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tarush
 */
public class Person extends Community{
    private String name;
    private String userAddress;
    private int zipCode;
    private ArrayList<String> errors = new ArrayList<>();

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<String> errors) {
        this.errors = errors;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        String zip = String.valueOf(zipCode);
        if (zip.length() == 5 ){
        this.zipCode = zipCode;
        }else{
            this.errors.add("Zip code seems to be incorrect. Please provide appropriate value.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String username;
    private String password;
    private String role;
    private String mail;

    public String getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(String AccountStatus) {
        this.AccountStatus = AccountStatus;
    }
    private int phone;
    private String gender;
    private Date dateOfBirth;
    private String AccountStatus = "Active";


    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        String phoneS = String.valueOf(phone);
        if (phoneS.length()== 10){
        this.phone = phone;
        }else{
        this.errors.add("Sorry but the number seems to be of wrong length.");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
