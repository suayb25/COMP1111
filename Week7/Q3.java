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
public class Q3 {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
    
    public static int power(int x, int y){
        if(y==0){
            return 1;
        }
        return x * power(x, y-1);
    }
}
