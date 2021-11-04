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
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = input.nextInt();
        int sum = 0;
        while(N>=1){
            sum += Math.pow(N, 2); //sum = sum + (int) Math.pow(N,2);
            N--;
        }
        System.out.println("Sum= " + sum);
    }
}
