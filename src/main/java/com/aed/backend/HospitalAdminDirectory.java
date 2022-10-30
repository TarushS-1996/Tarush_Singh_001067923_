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
public class HospitalAdminDirectory {
    private ArrayList<HospitalAdmin> hosAdmin = new ArrayList<>();
    
    public HospitalAdminDirectory(){
    this.hosAdmin = new ArrayList<>();
    }

    public ArrayList<HospitalAdmin> getHosAdmin() {
        return hosAdmin;
    }

    public void setHosAdmin(ArrayList<HospitalAdmin> hosAdmin) {
        this.hosAdmin = hosAdmin;
    }
    
    public HospitalAdmin addHospitalAdmin(){
    HospitalAdmin hoAd = new HospitalAdmin();
    hosAdmin.add(hoAd);
    return hoAd;
    }
            
}
