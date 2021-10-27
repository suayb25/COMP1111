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
        System.out.println("Enter operand 1: ");
        double operand1 = input.nextDouble();
        System.out.println("Enter operand 2: ");
        double operand2 = input.nextDouble();
        System.out.println("Enter operator (+, -, x, /, ^, %)");
        String operator = input.next();
        double result =0;
        switch(operator.toLowerCase()){//operator
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
                result = Math.pow(operand1, operand2);//^ means that -> bitwise XOR look at line 47
                break;
            case "%":
                result = operand1%operand2;
                break;
            default:
                System.out.println("Please enter a valid operator (+, -, x, /, ^, %)");
        }
        System.out.println("Result= " + result);
        //System.out.println(5^6); //0101 ^ 0110 = 0011 = 3
    }
}