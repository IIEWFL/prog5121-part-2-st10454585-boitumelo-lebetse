package com.mycompany.testlease;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lab_services_student
 */
public class Lease {

    //all data members are always private 
    private String name;
    private int number;
    private double rent;
    private int months;

    //constructor with variables initiated
    public Lease() {
        this.name = "XXX";
        this.number = 0;
        this.rent = 1000;
        this.months = 12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    //you create a method within your class 
    //this method adds the pet fee to the initial rent amount 
    public void addPetFee() {
        this.rent = this.rent + 10;
        //this calls another method and displays the message in that method 
        explainPetPolicy();
    }
    //method explain the pet policy 

    public static void explainPetPolicy() {

        JOptionPane.showMessageDialog(null, "We will add R10 to your monthly rent because you have a pet");
    }

    @Override
    public String toString() {
        return "Lease{" + "name=" + name + ", number=" + number + ", rent=" + rent + ", months=" + months + '}';
    }
    
    
}