/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.acmepay;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class AcmePay {
    
    //Declaring Constants
    private static final double firstshift = 17;
    private static final double secondshift = 18.5;
    private static final double thirdshift= 22;

    public static void main(String[] args) {
        Scanner Shift = new Scanner(System.in);

        //input
        System.out.print("Enter hours you have worked:");
        double hoursWorked = shift.nextDouble();

        System.out.print("Enter shift : 1, 2 or 3");
        int shift = scanner.nextInt();

        boolean retirement = false;
        if (shift == 2 || shift == 3) {
            System.out.print("Do you want to participate in the retirement plan? : YES(1) OR NO(2)");
            int retirementInput = scanner.nextInt();
            
            if (retirementInput == 1) {
                retirement = true;
            }
            
            int normalHours = 0;
            int overtimeHours = 0;
            int hours = 0;
            
            if (hours > 40) {
                normalHours = 40;
                overtimeHours = hours - 40;
            }else {
                normalHours = hours;
                overtimeHours = 0;
            }
                    
            
            //determine hourly rates
        //double hourlyRate;
        //if (shift == 1) {
        //    hourlyRate = 17;
        //}else if (shift == 2) {
        //    hourlyRate = 18.50;
        //}else if (shift == 3) {
         //   hourlyRate = 22;
         
            
        }
        }

    }

