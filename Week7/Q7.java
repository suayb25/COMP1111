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
public class Q7 {
    public static void main(String[] args) {
        displayReverseBinary(13);
		System.out.println("");
		displayBinary(13);
    }
    
    public static void displayReverseBinary(int N){
        if(N>0){
            System.out.print(N%2);
            displayReverseBinary(N/2);
        }
    }

	public static void displayBinary(int N){
        if(N>0){
            displayBinary(N/2);   
            System.out.print(N%2);
        }
    }
}
