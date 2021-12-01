/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author suayb
 */
public class Q12 {
    //fibonacci numbers
    // 1 2 3 4 5 6 7 ...
    // 0 1 1 2 3 5 8 ...

    public static void main(String[] args) {
        int result = fibonacci(2);
        if(result!=-1){
            System.out.println(result);
        }else{
            System.out.println("You sent a non positive index number!");
        }
        
    }

    public static int fibonacci(int N) {
        if (N <= 0) {
            return -1;
        } else {
            int N_2 = 0;
            int N_1 = 1;
            int Nth_number = 0;
            if (N != 1) {
                Nth_number = 1;
            }
            for (int i = 3; i <= N; i++) {
                Nth_number = N_1 + N_2;
                N_2 = N_1;
                N_1 = Nth_number;
            }
            return Nth_number;
        }
    }
}
