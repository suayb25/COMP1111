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
public class Q12 {

    public static void main(String[] args) {
        double[][] res = randomMatrix(5, 5);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static double[][] randomMatrix(int M, int N) {
        double[][] random = new double[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                random[i][j] = Math.random();
            }
        }
        return random;
    }
}
