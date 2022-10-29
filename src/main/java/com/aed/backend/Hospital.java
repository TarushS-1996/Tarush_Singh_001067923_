/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.backend;

/**
 *
 * @author tarush
 */
public class Hospital {
    private String hospitalName;
    private int hospitalZipCode;
    private String hospitalAddress;
    private int hospitalNumber;

    public int getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(int hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getHospitalZipCode() {
        return hospitalZipCode;
    }

    public void setHospitalZipCode(int hospitalZipCode) {
        this.hospitalZipCode = hospitalZipCode;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }
}
