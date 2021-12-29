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
public class Q11 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 2, 5, 5};
        System.out.println(findMostOccuring2(a));
    }
    
    public static int findMostOccuring(int[] a) {
        int max_element = a[0];
        int max_count = 1;
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (i == a[j]) {
                    count++;
                }
            }
            if (count > max_count) {
                max_element = i;
                max_count = count;
            }
        }
        return max_element;
    }
    

    public static int findMostOccuring2(int[] a) {
        int max_element = a[0];
        int max_count = 1;
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > max_count) {
                max_element = a[i];
                max_count = count;
            }
        }
        return max_element;
    }

}
