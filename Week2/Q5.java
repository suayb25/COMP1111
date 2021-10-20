/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author suayb
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade1 = input.nextInt();
        int grade2 = input.nextInt();
        int grade3 = input.nextInt();
        int grade4 = input.nextInt();
        
        double average = (grade1 + grade2 + grade3 + grade4)/4;
        System.out.println("Average is " + average);
        if(grade1 >= average){//grade-average>0 bu choose the simples one
            System.out.println("Student 1 passed.");
        }else{
            System.out.println("Student 1 failed.");
        }
        
        if(grade2 >= average){
            System.out.println("Student 2 passed.");
        }else{
            System.out.println("Student 2 failed.");
        }
        
        if(grade3 >= average){
            System.out.println("Student 3 passed.");
        }else{
            System.out.println("Student 3 failed.");
        }
        
        if(grade4 >= average){
            System.out.println("Student 4 passed.");
        }else{
            System.out.println("Student 4 failed.");
        }
    }
}
