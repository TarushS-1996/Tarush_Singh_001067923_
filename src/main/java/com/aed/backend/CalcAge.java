/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.backend;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author tarush
 */
public class CalcAge {
    
    public static int calcAge(String date){
        String year[] = date.split("/"); 
        int dayToWorkWith = Integer.parseInt(year[0]);
        int monthToWorkWith = Integer.parseInt(year[1]);
        int yearToWorkWith = Integer.parseInt(year[2]);
        LocalDate dateOfBirth = LocalDate.of(yearToWorkWith, monthToWorkWith, dayToWorkWith);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(dateOfBirth, currentDate).getYears();
        return age;
    }
}
