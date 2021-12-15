/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author talha
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter an integer: ");
         int n = input.nextInt();
         int num_of_prime = 0;
         for (int i = 2; i <= n; i++) {
             boolean prime = true;
             for (int j = 2; j < i; j++) {
                 if(i%j == 0){
                     prime = false;
                     break;
                 }
             }
             if(prime){
                 num_of_prime += 1;
             }
         }//We need number of prime for prime array
         
         int [] primes = new int [num_of_prime];
         int index = 0;
          for (int i = 2; i <= n; i++) {
             boolean prime = true;
             for (int j = 2; j < i; j++) {
                 if(i%j == 0){
                     prime = false;
                     break;
                 }
             }
             if(prime){
                 primes[index] = i;
                 index++;
             }
         }
          
          for (int i = 0; i < primes.length; i++) {
              System.out.print(primes[i] + " ");
         }
    } 
}
