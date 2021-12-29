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
public class Q12 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 2, 5};
        double[] result = normalize(a);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static double[] normalize(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = 1.0*a[i] / sum; //(double) a[i] / sum;
        }
        return result;
    }

}
