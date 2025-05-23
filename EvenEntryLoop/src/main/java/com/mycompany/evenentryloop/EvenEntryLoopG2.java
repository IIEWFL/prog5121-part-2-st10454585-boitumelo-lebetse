/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenentryloop;
import java.util.Scanner;


public class EvenEntryLoopG2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("please enter a even number or 999 to stop: ");
        int num = inputDevice.nextInt();
        
        while (num != 999) {
            if (num % 2==0){
                System.out.println("Good Job");
            }else {
                System.out.println("Wrong input!!!!");
            }
            
            // get user input
            System.out.print("please enter a even number or 999 to stop: ");
            num = inputDevice.nextInt();
        }
    }
    
}
