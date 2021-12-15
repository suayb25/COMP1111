/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author talha
 */
public class Q1 {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        
        int[] digits = new int [10]; 
        //digits[0] digits[1] digits[2] ... digits[9]
        int i = 0;
        while(n > 0){
            digits[i] = n%10;
            n = n/10;
            i++;
        }
        for (int j = 0; j < digits.length; j++) {
            System.out.print(digits[j] + " ");
        }
        
    }
}
