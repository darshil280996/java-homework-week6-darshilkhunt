package javahomeworkweek6darshilkhunt;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Program17DecimaltoBinaryConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner dcbc = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = dcbc.nextInt();

        // Close the scanner to prevent resource leaks
        dcbc.close();

        // Convert the decimal number to a binary string
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Display the result
        System.out.println("Binary number is: " + binaryNumber);
    }
}
