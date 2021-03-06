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
public class Q10 {

    public static void main(String[] args) {
        int result = factorial(0);
        if (result != -1) {
            System.out.println(result);
        }else{
            System.out.println("You sent a negative number! Please try to enter numbers bigger or equal to 0 .");
        }
		result = combination(5, 3);
		if (result != -1) {
            System.out.println(result);
        }else{
            System.out.println("You sent a negative number! Please try to enter numbers bigger or equal to 0 .");
        }
    }

    public static int factorial(int N) {
        if (N < 0) {
            return -1;
        } else {
            int result = 1;
            for (int i = 2; i <= N; i++) {
                result = result * i;
            }
            return result;
        }
    }

    public static int combination(int M, int N) {//Solution of Q11
        return factorial(M) / (factorial(N) * factorial(M - N));
    }//We can use int because combination results always be integer number.
}
