
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.decisionmaking;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class DecisionMaking {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Please provide me with your name =>");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please provide me with your age =>"));

        // == testing equalitiy
        // >= more or equal
        //IF STATEMENT
        if (age >= 18) {
            JOptionPane.showMessageDialog(null, name + "congrats you can enter");
            // IF...ELSE STATEMENT 
        } else {
            JOptionPane.showMessageDialog(null, name + "sorry you cannot enter" + "You cannot enter because age required is" + age);
        }
        //MULTIPLE IF...ELSE IF...ELSE STATEMENT
        int monthNumber = Integer.parseInt(JOptionPane.showInputDialog("Please provide the month value between 1 and 12"));

        if (monthNumber == 1) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is JANUARY");
        } else if (monthNumber == 2) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is FEBRUARY");
        } else if (monthNumber == 3) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is MARCH");
        } else if (monthNumber == 4) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is APRIL");
        } else if (monthNumber == 5) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is MAY");
        } else if (monthNumber == 6) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is JUNE");
        } else if (monthNumber == 7) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is JULY");
        } else if (monthNumber == 8) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is AUGUST");
        } else if (monthNumber == 9) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is SEPTEMBER");
        } else if (monthNumber == 10) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is OCTOBER");
        } else if (monthNumber == 11) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is NOVEMBER");
        } else if (monthNumber == 12) {
            JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is DECEMBER");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }

        //SWITCH
        switch (monthNumber) {
            case 1:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is JANUARY");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is FEBRUARY");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is MARCH");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is APRIL");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is MAY");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is JUNE");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is JULY");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is AUGUST");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is SEPTEMBER");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is OCTOBER");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is NOVEMBER");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Value" + monthNumber + "is DECEMBER");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        }
        //NESTED IF STATEMENT
        int number = Integer.parseInt(JOptionPane.showInputDialog("please provide a positive number"));

        if (number >= 0) {
            JOptionPane.showMessageDialog(null, "This number is positive");

            if (number % 5 == 0) {
                JOptionPane.showMessageDialog(null, "This number is a multiple of 5");
            } else {
                JOptionPane.showMessageDialog(null, "This number is not a multiple of 5");
            }
        } else {
            JOptionPane.showMessageDialog(null, "This number is negative");
        }
       

    }
}
