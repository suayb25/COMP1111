/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author talha.ozcelik
 */
public class Q8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        double operand1 = input.nextDouble();
        System.out.println("Enter second operand: ");
        double operand2 = input.nextDouble();
        System.out.println("Enter operator(+, -, x, /, ^, %): ");
        String operator = input.next();
        double result = 0;
        switch (operator.toLowerCase()) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "x":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            case "^":
                result = Math.pow(operand1,operand2); //when you take int you can use operand1^operand2
                break;
            case "%":
                result = operand1 % operand2;
                break;
            default:
                System.out.println("Please enter a valid operator(+, -, x, /, ^, %).");
        }
        System.out.println("Result: " + result);
        System.out.println((int)operand1^(int)operand2); //^ = bitwise XOR , 0101 ^ 0110 = 0011, 
        //It returns true if and only if both operand's values are different
    }
}
