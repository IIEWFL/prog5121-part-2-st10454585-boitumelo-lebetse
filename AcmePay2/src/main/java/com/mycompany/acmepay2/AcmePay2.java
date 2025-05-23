/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acmepay2;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;


public class AcmePay2 {
    
    
    private static final double FIRST_SHIFT_RATE = 17;
    private static final double SECOND_SHIFT_RATE = 18.5;
    private static final double THIRD_SHIFT_RATE = 22;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputDevice = new Scanner(System.in);
        
        System.out.println("Please enter the number of hours worked");
        int hours = inputDevice.nextInt();
        
        System.out.println("What is your shift (1, 2 or 3)?");
        int shift = inputDevice.nextInt();
        
        boolean retirement = false;
        
        double rate = 0;
        
        if(shift == 2 || shift == 3) {
            System.out.println("Do you want retirement? Yes(1) or No(2)?");
            int retirementChoice = inputDevice.nextInt();
            
            if(retirementChoice == 1) {
                retirement = true;
            }
            
            if(shift == 2) {
                rate = SECOND_SHIFT_RATE;
            } else {
                rate = THIRD_SHIFT_RATE;
            }
        } else {
            rate = FIRST_SHIFT_RATE;
        }
        
        int normalHours = 0;
        int overtimeHours = 0;
        
        if(hours > 40) {
            normalHours = 40;
            overtimeHours = hours - 40;
        } else {
            normalHours = hours;
            overtimeHours = 0;
        }
        
        System.out.println("1) You worked for " + hours);
        System.out.println("2) Your shift is " + shift);
        System.out.println("3) Your hourly pay rate is " + rate);
        
        double regularPay = normalHours * rate;
        double overtimePay = overtimeHours * rate * 1.5;
        
        System.out.println("4) Your regular pay is " + regularPay);
        System.out.println("5) Your overtime pay is " + overtimePay);
        
        
        double totalPay = regularPay + overtimePay;
        
        System.out.println("6) Your total pay is " + totalPay);
        
        double retirementTotal = 0;
        if(retirement) {
            retirementTotal = totalPay * 0.03;
            System.out.println("7) Your retirement amount is " + retirementTotal);
        }
        
        double netPay = totalPay - retirementTotal;
        
        System.out.println("8) Your net pay is " + netPay);
    }
    
}
