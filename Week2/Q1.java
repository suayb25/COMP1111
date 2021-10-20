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
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price: ");
        double price = input.nextDouble();
        System.out.println("Enter product type: ");
        int type = input.nextInt();
        double tax = 0;//if we did not set initial value, it will give an error.
        if(type==172){
            tax = 0.18;
        }else if(type==188){
            tax = 0.08;
        }else if(type==0){
            tax = 0;
        }
        //System.out.println("Total cost: " + price + price*tax); Wrong
        System.out.println("Total cost: " + (price + price*tax));
        /*
        double totalCost = price + price*tax;
        System.out.println("Total cost: " + totalCost);
        */
        //Or we can write it with switch case
        
    }
}
