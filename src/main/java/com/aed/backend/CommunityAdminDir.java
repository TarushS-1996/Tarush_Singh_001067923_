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
public class CommunityAdminDir {
    private ArrayList<Community> commAdminDir = new ArrayList<>();
    
    public CommunityAdminDir(){
        this.commAdminDir = new ArrayList<>();
}

    public ArrayList<Community> getCommAdminDir() {
        return commAdminDir;
    }

    public void setCommAdminDir(ArrayList<Community> commAdminDir) {
        this.commAdminDir = commAdminDir;
    }
    
    public Community addCommunity(){
    Community com = new Community();
    commAdminDir.add(com);
    return com;
    }
}
