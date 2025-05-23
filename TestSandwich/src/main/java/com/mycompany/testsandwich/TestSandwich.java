/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testsandwich;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TestSandwich {

    public static void main(String[] args){
        Sandwich sandwich = new Sandwich();
        
        sandwich.setIngredient("Tuna");
        sandwich.setBreadType("Wheat");
        sandwich.setPrice(4.99);
        
        
        System.out.println("Ingredient =>" + sandwich.getIngredient());
        System.out.println("BreadType =>" + sandwich.getIngredient());
        System.out.println("Price =>" + sandwich.getIngredient());
    }
}
