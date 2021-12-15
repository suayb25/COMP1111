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
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 integers: ");
        int [] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
          for (int i = 0; i < numbers.length; i++) {
             if(max < numbers[i])
                 max = numbers[i];
             
             if(min > numbers[i])
                 min = numbers[i];      
         }
          System.out.println("Max: " + max + " , Min:" + min);
    }
}
