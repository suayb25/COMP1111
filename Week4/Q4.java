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
public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = input.nextInt();
        while(radius<=0){
            System.out.println("Please enter radius bigger than 0: ");
            radius = input.nextInt();
        }
        System.out.println("Enter height: ");
        int height = input.nextInt();
        while(height<=0){
            System.out.println("Please enter height bigger than 0: ");
            height = input.nextInt();
        }
        double volume = (Math.PI * height * Math.pow(radius, 2))/3;       
        System.out.println("Volume: " + volume);
    }
}
