/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.backend;

/**
 *
 * @author tarush
 */
public class Community extends Hospital{
    private String communityName;
    private int zommunityZipCode;
    private String communityID;

    public String getCommunityID() {
        return communityID;
    }

    public void setCommunityID(String communityID) {
        this.communityID = communityID;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public int getZommunityZipCode() {
        return zommunityZipCode;
    }

    public void setZommunityZipCode(int zommunityZipCode) {
        this.zommunityZipCode = zommunityZipCode;
    }
}
