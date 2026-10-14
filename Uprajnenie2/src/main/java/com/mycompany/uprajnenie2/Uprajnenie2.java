package com.mycompany.uprajnenie2;

import java.util.Scanner;

public class Uprajnenie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vuvedi broi pochivni dni: ");
        int pochivniDni = scanner.nextInt();
        int rabotniDni = 365-pochivniDni;
        int vreme = rabotniDni*63+pochivniDni*127;
        int razlika = 30000-vreme;
        if(razlika>=0){
            System.out.println("Tom shte se naspi.");
            System.out.println("Razlikata ot normata e: " + razlika + " minuti.");
            
            
        }
        else{
            System.out.println("Tom nqma da se naspi.");
            System.out.println("Nedostigat mu: " + (-razlika) + " minuti");
        }
        
    }
}
