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
public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = input.nextInt();
        System.out.println("Enter y: ");
        int y = input.nextInt();
        int result = 1;
        while(y>0){
            result *= x;
            y--;
        }
        System.out.println("Result = " + result);
    }
}
