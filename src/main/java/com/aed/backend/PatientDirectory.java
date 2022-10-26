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
public class PatientDirectory {
    private ArrayList<Patient> dir = new ArrayList<>();
    
    public PatientDirectory(){
        this.dir = new ArrayList<>();
    }

    public void setDir(ArrayList<Patient> dir) {
        this.dir = dir;
    }
    
    public ArrayList<Patient> getDir() {
        return dir;
    }
    
    public Patient addPerson(){
        Patient person = new Patient();
        dir.add(person);
        return person;
    }
}
