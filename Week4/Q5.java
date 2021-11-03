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
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");    
        int number = input.nextInt();
        int max = number;
        while(number>=0){
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if(number>=max){
                max = number;
            }
        }
        System.out.println("The max number is: " + max);
    }
}
