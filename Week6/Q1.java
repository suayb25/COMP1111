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
    
    public static void displayStars(int emptySpace1, int star1, int emptySpace2, int star2){// Overloaded displayStars()
         displayStars(emptySpace1, star1);
         displayStars(emptySpace2, star2);
     }
    //Overload = same name by taking different number of input parameters or type of input parameters or both.
    
    public static void displayRectangle(int M, int N){////Solution of Q3
         for (int i = 1; i <= M; i++) {
             if(i == 1 || i == M){
                 displayStars(0, N);
             }else{
                 displayStars(0, 1, N-2, 1);
             }    
             System.out.println("");
         }
     }
}
