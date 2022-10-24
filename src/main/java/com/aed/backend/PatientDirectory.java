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
    private ArrayList<Person> dir = new ArrayList<>();
    
    public PatientDirectory(){
        this.dir = new ArrayList<>();
    }

    public void setDir(ArrayList<Person> dir) {
        this.dir = dir;
    }
    
    public ArrayList<Person> getDir() {
        return dir;
    }
    
    public Person addPerson(){
        Person person = new Person();
        dir.add(person);
        return person;
    }
}
