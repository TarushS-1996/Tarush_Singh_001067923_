/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.backend;

/**
 *bp, height heart rate, temps, respiration.
 * @author tarush
 */
public class VitalSigns extends Patient{
    private int heartRate;
    private int height;
    private int bloodPressure;
    private int bodyTemperatur;
    private int respirationRate;

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getBodyTemperatur() {
        return bodyTemperatur;
    }

    public void setBodyTemperatur(int bodyTemperatur) {
        this.bodyTemperatur = bodyTemperatur;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }
}
