/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author talha
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = input.nextInt();
        int total = 1;
        for (int i = 2; i < N-1; i++) { //(N/2)+1
            if(N%i==0){
               total += i; 
            }    
        }
        if (N==total) {
            System.out.println("Perfect Number!");
        }else{
            System.out.println("Not Perfect Number!");
        }        
    }
}
