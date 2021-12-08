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
public class Q10 {

    public static void main(String[] args) {
        displayDigits(123);
    }

    public static void displayDigits(int N) {
        if (N == 0) {
            return;
        }
		//System.out.print(N % 10 + " ");
        displayDigits(N / 10);
        System.out.print(N % 10 + " ");
    }
}
