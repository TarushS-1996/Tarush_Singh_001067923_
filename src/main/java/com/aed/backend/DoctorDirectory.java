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
public class DoctorDirectory {
    private ArrayList<DoctorPerson> doctorDir = new ArrayList<>();
    
    public DoctorDirectory(){
        this.doctorDir = new ArrayList<>();
    }

    public ArrayList<DoctorPerson> getDoctorDir() {
        return doctorDir;
    }

    public void setDoctorDir(ArrayList<DoctorPerson> doctorDir) {
        this.doctorDir = doctorDir;
    }
    
    public DoctorPerson addDcotorPerson(){
        DoctorPerson doc = new DoctorPerson();
        doctorDir.add(doc);
        return doc;
    }
}
