/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author talha.ozcelik
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price: ");
        double price = input.nextDouble();
        System.out.println("Enter type: ");
        int type = input.nextInt();
        double tax = 0;
        switch(type){
            case 172:
                tax = 0.18;
                break;
            case 188:
                tax = 0.08;
                break;
            case 196:
                tax = 0;
                break;
            default:
                System.out.println("Type of the product is wrong!");
        }
        double totalCost = price + price * tax;
        System.out.println("Total Cost: " + totalCost);
        //System.out.println("Total Cost: " + (price + price*tax));
        //System.out.println("Total Cost: " + price + price*tax); //Wrong
    }
}
