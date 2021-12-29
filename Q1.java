/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_1;

import java.util.Scanner;

/**
 *
 * @author talha
 */
public class Q1 {
    public static void main(String[] args) {
        int[] result = digitsToArray();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] digitsToArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int[] digits = new int[10];
        
        int i = 0;
        while(n>0){
            digits[i] = n%10;
            n = n/10;
            i++;
        }
        return digits;
    }
}
