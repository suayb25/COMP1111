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
public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int previous_1 = input.nextInt();
        System.out.println("Enter second number: ");
        int previous_2= input.nextInt();
        System.out.println("Enter third number: ");
        int number = input.nextInt();
        int sum = previous_1 + previous_2 + number;
        int count = 3;
        while(number!= previous_1 + previous_2){
            System.out.println("Enter a number: ");
            previous_1 = previous_2;
            previous_2 = number;
            number = input.nextInt();
            sum += number;
            count++;
        }
        
        System.out.println("Sum: " + sum + " Count: " + count);
    }
}
