/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author suayb
 */
public class Q3 {
    public static void main(String[] args) {
        //int number = (int) (Math.random()*9);
        int number = (int) (Math.random()*999) +1;
        //(int)(Math.random()*(max-min+1)+min);
        System.out.println("Number: " + number);
        if(number<=999 && number>=100){
            System.out.println("The number has 3 digit.");
        }else if(number<=99 && number>=10){
            System.out.println("The number has 2 digit.");
        }else if(number<=9 && number>=0){
            System.out.println("The number has 1 digit.");
        }
    }
    
    public int digitCount(int number){
        if(number<=999 && number>=100){
            return 3;
        }else if(number<=99 && number>=10){
            return 2;
        }else if(number<=9 && number>=0){
            return 1;
        }
        return -1; //otherwise unknown, error
    }
}
