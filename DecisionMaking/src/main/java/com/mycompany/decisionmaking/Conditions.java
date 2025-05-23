/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decisionmaking;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Conditions {
    public static void main(String[]args) {
        
        String value = JOptionPane.showInputDialog ("Please enter your gender =>");
        char gender = value.charAt(0) ;
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age")) ;
        
        if(age >= 21 && gender == 'F'){
            JOptionPane.showMessageDialog(null,"You are allowed in");
        } else {
            JOptionPane.showMessageDialog(null, "You are not allowed in");
            
        }
        //not a condition
        if(!(age >= 21)) {
 
        }
        //all conditions combined
        //when combining all condition && comes first then || comes second
        boolean payment = false;
        if(age ==18 && gender == 'F' || payment == false) {
            
        }
        
        if (5+3 > 5+4) {
            
            //this is for only when you want to use the long route
        }
        if (gender == 'F') {
            System.out.println("Yay you are female");
        }else{
            System.out.println("Noo its a dude");
        }
        
        //this is for a shortcut... for the above 5 lines
        System.out.println(gender == 'F' ? "Yay you are a female" : "Noo it is a male");
        
    }
}
