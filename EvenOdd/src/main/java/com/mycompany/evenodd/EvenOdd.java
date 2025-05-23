/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.evenodd;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class EvenOdd {

    public static void main(String[] args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter your number"));

        if (number % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Your number is an even");
        } else if (!(number % 2 == 0)) {
            JOptionPane.showMessageDialog(null, "Your number is an odd number");

        }

    }

}
