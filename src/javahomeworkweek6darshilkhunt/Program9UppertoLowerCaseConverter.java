package javahomeworkweek6darshilkhunt;

// Write a program to convert the upper case to lower case

import java.util.Scanner;

public class Program9UppertoLowerCaseConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner case1 = new Scanner(System.in);

        // Prompt the user to enter a string in uppercase
        System.out.print("Enter a string in uppercase: ");
        String uppercaseString = case1.nextLine();

        // Close the scanner to prevent resource leaks
        case1.close();

        // Convert the string to lowercase
        String lowercaseString = uppercaseString.toLowerCase();

        // Display the converted string
        System.out.println("Converted to lowercase: " + lowercaseString);
    }
}
