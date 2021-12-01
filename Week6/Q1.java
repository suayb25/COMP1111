/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author suayb
 */
public class Q1 {
    public static void main(String[] args) {
        displayStars(4, 5);
    }
    
    public static void displayStars(int emptySpace, int star){
        for (int i = 0; i < emptySpace; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
    }
   
}
