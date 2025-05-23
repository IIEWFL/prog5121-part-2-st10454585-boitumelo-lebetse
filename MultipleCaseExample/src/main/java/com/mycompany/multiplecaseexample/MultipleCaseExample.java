/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.multiplecaseexample;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class MultipleCaseExample {

    public static void main(String[] args) {
        // FOR LOOP

        // for loop has the starting piont where index is = 0 
        // a condition that explains for how long it has to repeat itself 
        // increment which is the x++ 

        int countMultipleOf5 = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the starting value ?");
        int startValue = scanner.nextInt();
        
        System.out.println("What is the ending value ?");
        int endingValue = scanner.nextInt();
    
        for (int x = startValue; x <= endingValue; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("This number " + x + " is both a multiplr of 3 and 5");
            } else {
                if (x % 3 == 0) {
                    System.out.println("This number " + x + " is a multiple of 3");
                } else if (x % 5 == 0) {
                    System.out.println("This number" + x + " is a multiple of 5");
                    countMultipleOf5++;
                } else {
                    System.out.println("This number " + x + " is neither a multiple of 3 nor 5 ");
                }
            }
            //decending order
            for (int a = 100; a > 0; a--) {
                if (a % 3 == 0 && a % 5 == 0) {
                    System.out.println("This number " + a + " is both a multiplr of 3 and 5");
                } else {
                    if (a % 3 == 0) {
                        System.out.println("This number " + a + " is a multiple of 3");
                    } else if (a % 5 == 0) {
                        System.out.println("This number" + a + " is a multiple of 5");
                    } else {
                        System.out.println("This number " + a + " is neither a multiple of 3 nor 5 ");
                    }
                }
            }
            //while loop 
            // int counter = 0;
            // while(counter <= 99) {
            //    counter++;
        }
    }
}
