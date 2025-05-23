/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.createpurchase;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class CreatePurchase {

    public static void main(String[] args) {
        Purchase Details = new Purchase ();
        Scanner inputDevice = new Scanner (System.in);
        
        System.out.println("Enter invoice number");
        int invoiceNumber = inputDevice.nextInt();
        
        do{
            if (! (invoiceNumber <= 1000 || invoiceNumber >= 8000)) {
                System.out.println("Invoice number must be inbetween 1000 & 8000");
                
                System.out.println("Enter invoice number");
                invoiceNumber = inputDevice.nextInt();
            }
        }while (! (invoiceNumber <= 1000 || invoiceNumber >= 8000));
        System.out.println("Thank You");
        
        System.out.println("Provide sales amount");
        int SaleA = inputDevice.nextInt();
        
        do{
            if (SaleA < 0){
                System.out.println("Invalid");
            }
        }while (! (SaleA <= 1000 || SaleA >= 8000));
        System.out.println("Thank You");
        
        System.out.println("Provide sale amount");
        int SaleB = inputDevice.nextInt();
        }
    }
}
