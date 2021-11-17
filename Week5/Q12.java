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
public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = input.nextInt();
        double result = 0;
        int count = 0;
        for (int i = 1; i < N; i+=2) {
            if(count%2==0){
                result += 1.0/i;//1/i
            }else{
                result -= 1.0/i;//1/i
            }
            count++;
        }
        result *= 4;
        System.out.println("Pi= " + result);
    }
}
