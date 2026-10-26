 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uprajnenie5;

/**
 *
 * @author students
 */
import java.util.Scanner;
public class Uprajnenie5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Zadacha 1 
        
        /*try {
           
          System.out.println("Vuvedi chislo: ");
          int chislo = scanner.nextInt();
          
          if(chislo<0){
              System.out.println("Invalid");
          }
          else {
              double koren = Math.sqrt(chislo);
              System.out.println("kvadratniq koren e: " + koren);
          }
        }
        catch(NumberFormatException e){
            System.out.println("Greshka, vuvedi cqlo chislo");
        }
        catch(Exception e){
            System.out.println("Druga greshka.");
        }
        finally{
            System.out.println("Goodbye");
        }*/
        
        try{
            System.out.println("Vuvedi chislo 1: ");
            int chislo1 = scanner.nextInt();
            System.out.println("Vuvedi chislo 2: ");
            int chislo2 = scanner.nextInt();
            
            int rezult = chislo1/chislo2;
            System.out.println("Rezultata e: " + rezult);
        }
        catch(ArithmeticException e){
            System.out.println("Ne moje da se deli na 0");
            
        }
        catch(NumberFormatException e){
            System.out.println("Greshka, vuvedi cqlo chislo");
        }
        
    }
}
