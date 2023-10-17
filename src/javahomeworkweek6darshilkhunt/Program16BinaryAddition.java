package javahomeworkweek6darshilkhunt;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

public class Program16BinaryAddition {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner bin12 = new Scanner(System.in);

        // Prompt the user to enter the first binary number
        System.out.print("Input first binary number: ");
        String binary1 = bin12.nextLine();

        // Prompt the user to enter the second binary number
        System.out.print("Input second binary number: ");
        String binary2 = bin12.nextLine();

        // Close the scanner to prevent resource leaks
        bin12.close();

        // Convert the binary strings to integers and add them
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);
        int sum = decimal1 + decimal2;

        // Convert the sum back to a binary string
        String binarySum = Integer.toBinaryString(sum);

        // Display the result
        System.out.println("Sum of two binary numbers: " + binarySum);
    }
}
