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
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        System.out.println("Enter third number: ");
        int number3 = input.nextInt();
        
        if(number1<=number2 && number1<=number3){ //number1 is smallest
            if(number2<=number3){
                System.out.println(number1+", " + number2 + ", " + number3);
            }else{
                System.out.println(number1+", " + number3 + ", " + number2);
            }
        }else if(number2<=number1 && number2<=number3){//number2 is smallest
            if(number1<=number3){
                System.out.println(number2 + ", " + number1 + ", " + number3);
            }else{
                System.out.println(number2 + ", " + number3 + ", " + number1);
            }
        }else{
            if(number1<=number2){//number3 is smallest
                System.out.println(number3 + ", " + number1 + ", " + number2);
            }else{
                System.out.println(number3 + ", " + number2 + ", " + number1);
            }
        }
    }
}
