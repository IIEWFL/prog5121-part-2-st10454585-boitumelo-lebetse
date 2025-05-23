/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.requestingsingleletter;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
//letter/digit = a
//letter/digit = B
//letter/digit = 5
public class RequestingSingleLetter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter or a digit");
        char valueA = 'a';

        if (Character.isLowerCase(valueA)) {
            System.out.println("This value" + valueA + "is a lowercase");
        }
        System.out.println("Enter a single letter or a digit");
        char valueB = 'B';
        if (Character.isUpperCase(valueB)) {
            System.out.println("This value" + valueB + "is an uppercase");
        }else {
            System.out.println("This value" + valueB + "is not an uppercase");
        }
        System.out.println("Please enetr a letter or digit");
        char valueC = input.nextLine().charAt(0);
        
        char Num = '5';
        
        if (Character.isDigit(Num)){
            System.out.println("This value"+ Num + "is a digit");
        }
        
    }
}
