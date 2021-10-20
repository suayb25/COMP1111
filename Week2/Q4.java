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
public class Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter NUM: ");
        int num = input.nextInt();
        /*
        if(num<0 && num%9==0){
            System.out.println("X");
        }else if(num>0 && num%7==0){
            System.out.println("Y");
        }else if(num%2!=0 && num>0){
            System.out.println("Z");
        }*/
        //When we read this 'If you display Y, do not display Z'
        /*if (num < 0 && num % 9 == 0) {
            System.out.println("X");
        } else {
            if (num > 0 && num % 7 == 0) {
                System.out.println("Y");
            } else if (num % 2 != 0 && num > 0) {
                System.out.println("Z");
            } else {
                System.out.println("W");
            }
        }*/
        //or we can write it like this: 
        boolean k = true;
        if (num < 0 && num % 9 == 0) {
            System.out.println("X");
        } else if (num > 0 && num % 7 == 0) {
            System.out.println("Y");
            k = false;
        } else if (num % 2 != 0 && num > 0 && k) {
            System.out.println("Z");
        } else {
            System.out.println("W");
        }

        //21(Y), 22(W), 23 (Z), -18(X)
    }
}
