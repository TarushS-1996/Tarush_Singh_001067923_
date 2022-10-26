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
public class SystemAdminDirectory {
    private ArrayList<SystemAdmin> adminDirectory = new ArrayList<>();
    
    public SystemAdminDirectory(){
        this.adminDirectory = new ArrayList<>();      
    }

    public ArrayList<SystemAdmin> getAdminDirectory() {
        return adminDirectory;
    }

    public void setAdminDirectory(ArrayList<SystemAdmin> adminDirectory) {
        this.adminDirectory = adminDirectory;
    }
    
    public SystemAdmin addSystemAdmin(){
        SystemAdmin admin = new SystemAdmin();
        adminDirectory.add(admin);
        return admin;
    }
}
