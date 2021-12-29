/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_1;

/**
 *
 * @author talha
 */
public class Q6 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 2};
        int[] result = doubleSize(a);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] doubleSize(int[] a) {
        int[] result = new int[2 * a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        return result;
    }
}
