/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author talha.ozcelik
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day = input.next();
        switch(day.toLowerCase()){ //We need to convert this otherwise user can enter MONDAY, MoNday
            //In switch case we are looking at exact values
            case "monday":
                System.out.println("Pazartesi");
                break;
            case "tuesday":
                System.out.println("Salı");
                break;
            case "wednesday":
                System.out.println("Çarşamba");
                break;
            case "thursday":
                System.out.println("Perşembe");
                break;
            case "friday":
                System.out.println("Cuma");
                break;
            case "saturday":
                System.out.println("Cumartesi");
                break;
            case "sunday":
                System.out.println("Pazar");
                break;      
        }
        
        /*switch(day){ //We need to convert this otherwise user can enter MONDAY, MoNday
            //In switch case we are looking at exact values
            case "monday":
            case "MoNday":
            case "Monday":
                System.out.println("Pazartesi");
                break;
            case "tuesday":
                System.out.println("Salı");
                break;
            case "wednesday":
                System.out.println("Çarşamba");
                break;
            case "thursday":
                System.out.println("Perşembe");
                break;
            case "friday":
                System.out.println("Cuma");
                break;
            case "saturday":
                System.out.println("Cumartesi");
                break;
            case "sunday":
                System.out.println("Pazar");
                break;      
        }*/
    }
}
