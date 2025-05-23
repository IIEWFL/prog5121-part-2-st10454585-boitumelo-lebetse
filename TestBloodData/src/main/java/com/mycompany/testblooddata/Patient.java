/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testblooddata;

/**
 *
 * @author lab_services_student
 */
public class Patient {
    private int idNumber;
    private int age;
    private BloodData BloodData;

    public Patient() {
    }

    public Patient(int idNumber, int age, BloodData BloodData) {
        this.idNumber = idNumber;
        this.age = age;
        this.BloodData = BloodData;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodData getBloodData() {
        return BloodData;
    }

    public void setBloodData(BloodData BloodData) {
        this.BloodData = BloodData;
    }

    @Override
    public String toString() {
        return "Patient{" + "idNumber=" + idNumber + ", age=" + age + ", BloodData=" + BloodData + '}';
    }
    
    
    
}


