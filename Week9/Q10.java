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
public class Q10 {

    public static void main(String[] args) {
        int[] array1 = {10, 15, 20, 40};
        int[] array2 = {1, 2, 3};
        int[] result = productArrays(array1, array2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] productArrays(int[] a, int[] b) {
        int length = a.length;
        if (b.length <= a.length) {
            length = b.length;
        }
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }
}
