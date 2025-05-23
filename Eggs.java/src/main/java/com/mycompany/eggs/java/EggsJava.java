/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eggs.java;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class EggsJava {

    public static void main(String[] args) {
        Scanner inputDevice =new Scanner(System.in);
        
        System.out.println("Provide value 2 dozen eggs");
        int number1 = inputDevice.nextInt();
        
        System.out.println("Provide value for 3 loose eggs");
        int number2 = inputDevice.nextInt();
        
        System.out.println("Provide value for the total");
        int number3 = inputDevice.nextInt();
        //process
        
        float sum = number1 * number2;
        
       
        
    }
}
