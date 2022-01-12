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
public class Q14 {
    public static void main(String[] args) {
        int[][] a = {{1,2,30},
                    {4,15,6}};
        System.out.println(max(a));
    }
    
    public static int max(int[][] a){
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}
