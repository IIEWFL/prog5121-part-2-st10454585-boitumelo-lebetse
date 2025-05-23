/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testlease;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TestLease {

    public static void main(String[] args) {

        //creates an object
        Lease tenent1 = new Lease();
        Lease tenent2 = new Lease();
        Lease tenent3 = new Lease();
        Lease tenent4 = new Lease();

        tenent1 = getData();
        tenent2 = getData();
        tenent3 = getData();
        
        showValues(tenent1);
        
        tenent1.addPetFee();
        
        showValues(tenent1);
        
        showValues(tenent2);
        showValues(tenent3);
        showValues(tenent4);

    }

    //method requires the user to input data and repeats the statements 3 times 
    private static Lease getData() {

        //GETTING DATA FROM THE USERS 
        String name = JOptionPane.showInputDialog("Please eneter tenent name =>");
        int number = Integer.parseInt(JOptionPane.showInputDialog("Please eneter apartment number =>"));
        double rent = Double.parseDouble(JOptionPane.showInputDialog("Please enetr rental monthly amount =>"));
        int months = Integer.parseInt(JOptionPane.showInputDialog("Please enter terms =>"));

        Lease lease = new Lease();

        //DATA THAT THE USER HAS INPUT
        lease.setName(name);
        lease.setNumber(number);
        lease.setRent(rent);
        lease.setMonths(months);

        return lease;
    }
    
    private static void showValues(Lease lease) {
       JOptionPane.showMessageDialog(null, lease.toString());
    }
}