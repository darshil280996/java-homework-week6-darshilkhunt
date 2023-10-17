package javahomeworkweek6darshilkhunt;

// Write a Java program that takes three numbers as input to calculate & print the average of the numbers.

import java.util.Scanner;

public class Program13AvgCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner Read1 = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double number1 = Read1.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = Read1.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = Read1.nextDouble();

        // Close the scanner to prevent resource leaks
        Read1.close();

        // Calculate the average of the three numbers
        double average = (number1 + number2 + number3) / 3;

        // Display the average
        System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is: " + average);
    }
}
