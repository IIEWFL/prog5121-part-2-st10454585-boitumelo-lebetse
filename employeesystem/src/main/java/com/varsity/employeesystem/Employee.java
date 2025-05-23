/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.employeesystem;


public class Employee {
    
    private String empNumber;
    private String emailAddress;
    private double salary;
    private String title;
    private String name;
    private String surname;
    private String phoneNumber;
    private int age;
    private char gender;
    private boolean isSenior;
  
    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
        
    }
    public void setEmailAdress(String emailAddress) {
        this.emailAddress = emailAddress;
        
    }
    public void setSalary(double salary) {
        this.salary = salary;
        
    }
    public void setTitle(String title) {
        this.title = title;
        
    }
    public void setName(String name) {
        this.name = name;
        
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setIsSenior(boolean isSenior) {
        this.isSenior = isSenior;
    }
    
    public String getEmpNumber() {
        return this.empNumber;
        
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public boolean isIsSenior() {
        return isSenior;
    }
    
}
