package javahomeworkweek6darshilkhunt;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */

public class Program5Calculator {
    // Step 1: Declare two static methods for addition and subtraction

    public static String add(double num1, double num2) {
        double result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public static String subtract(double num1, double num2) {
        double result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    // Step 2: Declare two instance methods for multiplication and division
    public String multiply(double num1, double num2) {
        double result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(double num1, double num2) {
        double result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }

    public static void main(String[] args) {
        // Step 3: Create an instance of the Calculator class
        Program5Calculator cal = new Program5Calculator();

        // Step 4: Perform calculations using both static and instance methods
        System.out.println("Static Methods:");
        // System.out.println(cal.add(10, 5));
        // System.out.println(cal.subtract(10, 5));
        System.out.println(add(10,5));
        System.out.println(subtract(10, 5));

        System.out.println("Instance Methods");
        System.out.println(cal.multiply(10, 5));
        System.out.println(cal.divide(10, 5));
    }
}