package javahomeworkweek6darshilkhunt;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

public class Program10MultiplicationTable {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner Table8 = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Input a number: ");
        int number = Table8.nextInt();

        // Close the scanner to prevent resource leaks
        Table8.close();

        // Print the multiplication table up to 10
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
