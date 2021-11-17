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
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = input.nextInt();
        int result = 1;
        for (int i = 2; i <= N; i++) {
            result*=i;
        }
        System.out.println("Result= " + result);
    }
}
