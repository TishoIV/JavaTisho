package com.mycompany.uprajnenie3;
import java.util.Scanner;

public class Uprajnenie3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int employees = scanner.nextInt();
        int hours = scanner.nextInt();
        
        int workingDays = days-days/10;
        int totalHours = workingDays*employees*8;
        int neededHours = hours*employees;
        
        
    }
}
