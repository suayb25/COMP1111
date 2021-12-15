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
public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        int [] binary = new int[10];
        int i = binary.length-1;
        while (n > 1){
            binary[i] = n%2;
            n = n/2;
            i--;
        }
        binary[i] = n;
        
        for (int j = 0; j < binary.length; j++) {
            System.out.print(binary[j] + " ");
        }
    }
}
