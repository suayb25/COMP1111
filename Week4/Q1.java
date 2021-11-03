/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author talha
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int count = 0;
        System.out.print("Digits: ");
        String digits = "";
        while(number>0){
            int digit = number % 10;
            number = number/10;
            count++;
            System.out.print(digit);
            digits = digits + digit;
        }
        System.out.println(" The number has " + count + " digits." + " Digits: " + digits);
    }
}
