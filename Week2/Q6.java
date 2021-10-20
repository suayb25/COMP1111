/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author suayb
 */
public class Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by both 5 and 6.");
        }else if(number%5==0 && number%6!=0){
            System.out.println(number + " is divisible by 5.");
        }else if(number%6==0 && number%5!=0){
            System.out.println(number + " is divisible by 6.");
        }else{
            System.out.println(number + " is not divisible by both 5 and 6.");
        }
    }
}