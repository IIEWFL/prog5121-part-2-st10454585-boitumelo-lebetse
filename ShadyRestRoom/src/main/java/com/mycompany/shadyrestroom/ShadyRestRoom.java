/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.shadyrestroom;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class ShadyRestRoom {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Welcome to Shady Rest Hotel \n"
    

        "We have three choices for rooms \n" +
        "1 for Queen Bed"+
        "2 for Kind Bed"+
        "3 for Suite Bed" +
        " Please make your choice =>");
        
        int roomChoice = inputDevice.nextInt();
        double price = 0;

        if (roomChoice == 1) {
            price = 125;
        } else if (roomChoice == 2) {
            price = 139;
        } else if (roomChoice == 3) {
            price = 165;
        } else {
            price = 0;
            System.out.println("Hey you have made a wrong chouce. You can enter only 1, 2 or 3");

        }
        
        

        if (roomChoice == 1 || roomChoice == 2 || roomChoice == 3) {
            System.out.println("Do you want a Lake View or a Park View? \n"
    
            "1 for Lake View"+
        "2 for Park View"+
        " Please make your choice =>");
        
        int viewType = inputDevice.nextInt();

            if (viewType == 1) {
                price = price + 15;
            } else if (viewType == 2) {
                price = price
            }else {
                System.out.println("You can only enter 1 for Lake View and 2 for Park View");
                
               price = price + 15;
            }
            System.out.println("Based on your room" + roomChoice + "and view type" + viewType + "Your price is" + price);

        

        }
    }
}
