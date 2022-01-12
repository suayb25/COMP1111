/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author talha
 */
public class Q1 {

    public static void main(String[] args) {
        int[][] a = {{2, 2}, {2, 2}};
        int[][] b = {{1, 1}, {2, 1}};
        int[][] res = differences2D(a, b);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] differences2D(int[][] a, int[][] b) {
        int[][] difference = new int[a.length][a[0].length];
        if (a.length != b.length || a[0].length != b[0].length) {
            return difference;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                difference[i][j] = a[i][j] - b[i][j];
            }
        }
        return difference;
    }
}
