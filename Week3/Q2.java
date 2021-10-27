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
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0-999: ");
        int number = input.nextInt();
        int ones = number%10;
        int tens = (number/10)%10;
        int hundreds = number/100;
        switch(hundreds){
            case 0:
                switch(tens){
                    case 0:
                        System.out.println("The number has 1 digit. The digit is " + ones);
                        break;
                    default:
                        System.out.println("The number has 2 digits. The digits are " + tens + " " + ones);
                }
                break;
            default:
                System.out.println("The number has 3 digits. The digits are " + hundreds + " " + tens + " " + ones);
        }
        
    }
}
