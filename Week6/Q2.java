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
public class Q2 {
    
    public static void main(String[] args) {
        displayStars(5, 5, 2, 2);
    }
    
    public static void displayStars(int emptySpace1, int star1, int emptySpace2, int star2){
        for (int i = 0; i < emptySpace1; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < star1; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < emptySpace2; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < star2; i++) {
            System.out.print("*");
        }
    }
}
