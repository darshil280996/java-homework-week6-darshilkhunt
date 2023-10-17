package javahomeworkweek6darshilkhunt;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Program6RadiusCircle {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan1 = new Scanner(System.in);

        // Tell the user to enter the radius
        double radius =scan1.nextDouble();

        // Close the scanner to prevent resource leaks
        scan1.close();

        // Calculate the area using the formula A = Pi * r * r
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

    }
}
