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
public class Q3 {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
        {4, 5, 6}};
        int[][] b = {{2, 2},
        {2, 2},
        {2, 2}};
        int[][] res = product(a, b);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] product(int[][] a, int[][] b) {
        int[][] product = new int[a.length][b[0].length];
        if (a[0].length != b.length) {
            return product;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }
}
