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
public class Q2 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                    {4,5,6}};
        int[][] res = transpose(a);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }
        
    public static int[][] transpose(int[][] a){
        int[][] tranpose = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                tranpose[j][i] = a[i][j];
            }
        }
        return tranpose;
    }
}
