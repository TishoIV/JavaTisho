/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uprajnenie1;

import java.util.Scanner;

/**
 *
 * @author students
 */
public class Uprajnenie1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kilometri izminati:");
        int n = sc.nextInt();
        System.out.println("Izberi prevoz: 1-Taxi, 2-Bus, 3-Vlak");
        int izbor = sc.nextInt();
        
        //System.out.println("Period: Den/Nosht: ");
        //String period = sc.nextLine();
      
        double taxinach = 0.90;   
        double bus = 1.50;
        double train = 2.0;
        
        switch(izbor){
            
            case 1:
        
        double pricetax = n*taxinach;
        System.out.println("Cena taxi: " + pricetax);
        
        break;
        
            case 2:
        
        double pricebus = n*bus;
        System.out.println("Cena Avtobus: " + pricebus);
        
        break;
        
            case 3:
       
        double pricetrain = n*train;
        System.out.println("Cena Vlak: " + pricetrain);
        }
 
    }
}
