/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.backend;

import java.util.ArrayList;

/**
 *
 * @author tarush
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalList = new ArrayList<>();
    
    public HospitalDirectory(){
    this.hospitalList = new ArrayList<>(); 
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    public Hospital addNewHospital(){
        Hospital hosp = new Hospital();
        hospitalList.add(hosp);
        return hosp;
    }
}
