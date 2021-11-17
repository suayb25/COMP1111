/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author suayb
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = input.nextDouble();
        System.out.println("Enter b : ");
        double b = input.nextDouble();
        System.out.println("Enter c : ");
        double c = input.nextDouble();
        System.out.println("Enter n : ");
        int n = input.nextInt();
        System.out.println("Enter x_0 : ");
        double x_0 = input.nextDouble();
        double result = x_0;
        for (int i = 0; i < n; i++) {
            System.out.println(result);
            System.out.println((a*result*result + b*result + c)/(2*result*a + b));
             result = result - (a*result*result + b*result + c)/(2*result*a + b);
             System.out.println(result);
        }
        System.out.println("Result = " + result);
    }
}