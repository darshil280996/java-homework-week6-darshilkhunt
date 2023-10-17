package javahomeworkweek6darshilkhunt;

// Write a program to calculate the area of a triangle

import java.util.Scanner;

public class Program8TriangleAreaCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan3 = new Scanner(System.in);

        // Prompt the user to enter the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scan3.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scan3.nextDouble();

        // Close the scanner to prevent resource leaks
        scan3.close();

        // Calculate the area of the triangle
        double area = (0.5) * base * height;

        // Display the result
        System.out.println("The area of the triangle is: " + area);
    }
}
