package javahomeworkweek6darshilkhunt;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Program14RectanglePerimeterCalculator {

    public static void main(String[] args) {
        // Define the width and height of the rectangle
        double width = 5.5;
        double height = 8.5;

        // Calculate the area and perimeter of the rectangle
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Display the results
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
    }
}
