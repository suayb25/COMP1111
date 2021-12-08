/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author suayb
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        displayStars(3,4);
    }
    
    public static void displayStars(int emptyStars, int stars){
        if(emptyStars!=0){
            System.out.print(" ");
            displayStars(emptyStars-1, stars);
        }else if(stars!=0){
            System.out.print("*");
            displayStars(emptyStars, stars-1);
        }
    }
    
}
