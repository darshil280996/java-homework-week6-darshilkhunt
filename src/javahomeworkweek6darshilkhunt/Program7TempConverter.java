package javahomeworkweek6darshilkhunt;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit & convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Program7TempConverter {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scan2 = new Scanner(System.in);

        // Prompt the user to enter the temperature in degrees Fahrenheit
        System.out.print("Enter the temperature in degrees Fahrenheit: ");

        // Read the temperature in degrees Fahrenheit from the user
        double temperatureInFahrenheit = scan2.nextDouble();

        // Close the scanner to prevent resource leaks
        scan2.close();

        // Convert the temperature to degrees Celsius using the formula
        double temperatureInCelsius = (temperatureInFahrenheit - 32) * 5.0 / 9.0;

        // Display the result
        System.out.println("Temperature in degrees Celsius: " + temperatureInCelsius + "°C");
    }
}
