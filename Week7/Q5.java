/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author suayb
 */
public class Q5 {
    public static void main(String[] args) {
        System.out.println(permutation(10, 3));
    }
        
public static int permutation(int M, int N){
    /*if(N==0){ //error
        return -1;
    }*/
    if(N==1){
        return M;
    }
    return M * permutation(M-1, N-1);
}    
}
