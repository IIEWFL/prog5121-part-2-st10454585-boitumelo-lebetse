/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pricing;

import java.util.Scanner;

public class Pricing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Palesa, how many items you want to capture?");

        int nbrItems = inputDevice.nextInt();

        int counter = 0;
        double total = 0;

        while (counter < nbrItems) {
            
            counter = counter + 1;
//            counter++;
            System.out.println("What is the price for item " + counter + " ?");
            double price = inputDevice.nextDouble();
            total = total + price;
        }

        System.out.println("The total is " + total);
        System.out.println("The counter is " + counter);

    }

}
