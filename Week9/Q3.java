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
public class Q3 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 5, 2};
        int[] result = removeDublicates2(a);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] removeDublicates(int[] numbers) {//We are accepting there are at most dublicates, not more.
        if (numbers.length == 0 || numbers.length == 1) {
            return numbers;
        }
        int dup_count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    dup_count++;
                }
            }
        }
        int[] no_dup = new int[numbers.length - dup_count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean duplicate = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                no_dup[index] = numbers[i];
                index++;
            }
        }
        return no_dup;
    }
    
    public static int[] removeDublicates2(int[] numbers) {
       if (numbers.length == 0 || numbers.length == 1) {
            return numbers;
        } 
        numbers = sort(numbers);
        int count = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i] != numbers[i+1]){
                count++;
            }
        }
        int[] no_dup = new int[count+1];
        int index = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i]!=numbers[i+1]){
                no_dup[index] = numbers[i];
                index++;
            }
        }
        no_dup[index] = numbers[numbers.length-1];
        return no_dup;
    }
    
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tmp = 0;
                if(arr[i]>arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
