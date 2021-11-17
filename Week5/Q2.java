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
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = input.nextInt();
        System.out.println("Enter n: ");
        int n = input.nextInt();
        double upper = 1;
        for (int i = 2; i <= m; i++) {
            upper *= i; 
        }
        double down = 1;
        for (int i = 2; i <= n; i++) {
            down *= i;
        }
        for(int i = 2; i<= m-n; i++){
            down *= i; 
        }
        System.out.println("Result = " + upper/down);
    }
}
