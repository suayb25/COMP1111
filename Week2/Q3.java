/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author talha.ozcelik
 */
public class Q3 {
    public static void main(String[] args) {
        //(int) (Math.random()*(max-min+1) + min);
        int number = (int) (Math.random()*1000);
        //int number1 = (int) (Math.random()*(500) + 1);//1-500
        //System.out.println("number1: " + number1);
        System.out.println("Random: " + number);
        int ones = number%10;
        int tens = (number/10)%10;
        int hundreds = number/100;
        if(number<=999 && number>=100){
            System.out.println("The number has 3 digits.");
        }else if(number<=99 && number>=10){
            System.out.println("The number has 2 digits");
        }else if(number<=9 & number>=0){
            System.out.println("The number has 1 digit.");
        }
        
        System.out.println("Ones : " + ones + ", Tens: " + tens + " , Hundreds: " + hundreds);
        /*125%10 = 5
        125/10 = 12.5  -> 12 %10 = 2   
        125/100 = 1*/
    }
}
