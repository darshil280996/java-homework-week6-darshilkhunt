package javahomeworkweek6darshilkhunt;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide  & remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Program18ArithmeticOperations {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner ops1 = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Input first number: ");
        double firstNumber = ops1.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Input second number: ");
        double secondNumber = ops1.nextDouble();

        // Close the scanner to prevent resource leaks
        ops1.close();

        // Perform arithmetic operations
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;
        double remainder = firstNumber % secondNumber;

        // Display the results
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
        System.out.println(firstNumber + " mod " + secondNumber + " = " + remainder);
    }
}
