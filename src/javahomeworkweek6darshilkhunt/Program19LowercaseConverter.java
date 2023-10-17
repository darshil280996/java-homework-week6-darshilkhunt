package javahomeworkweek6darshilkhunt;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;

public class Program19LowercaseConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner case1 = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = case1.nextLine();

        // Close the scanner to prevent resource leaks
        case1.close();

        // Convert the string to lowercase
        String lowercaseString = inputString.toLowerCase();

        // Display the result
        System.out.println("Output: " + lowercaseString);
    }
}
