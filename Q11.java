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
public class Q11 {
    public static void main(String[] args) {
        int[][] res = identityMatrix2(5);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static int[][] identityMatrix(int N){
        int[][] identity = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i==j){
                    identity[i][j] = 1;
                }
            }
        }
        return identity;
    }
    
    public static int[][] identityMatrix2(int N){
        int[][] identity = new int[N][N];
        for (int i = 0; i < N; i++) {
            identity[i][i] = 1;
        }
        return identity;
    }
}
