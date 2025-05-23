/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testblooddata;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TestBloodData {
    public static void main(String[] args){
        BloodData bloddData = new BloodData();
        
        showValues(bloddData);     
    }
    
    private static void showValues(BloodData data) {
        JOptionPane.showMessageDialog(null, data.toString());
        
        
    }
}
