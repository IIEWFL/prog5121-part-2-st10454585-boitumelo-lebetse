/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testblooddata;

/**
 *
 * @author lab_services_student
 */
public class BloodData {
    private String BloodType;
    private String rhFactor;

    public BloodData() {
        
        this.BloodType = "O";
        this.rhFactor = "+";
      
    }
    

    public BloodData(String BloodType, String rhFactor) {
        this.BloodType = BloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    @Override
    public String toString() {
        return "BloodData{" + "BloodType=" + BloodType + ", rhFactor=" + rhFactor + '}';
    }
    
    
    
}

