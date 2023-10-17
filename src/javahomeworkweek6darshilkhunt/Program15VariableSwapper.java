package javahomeworkweek6darshilkhunt;

// Write a Java program to swap two variables

public class Program15VariableSwapper {

    public static void main(String[] args) {
        // Define two variables
        int a = 5;
        int b = 10;

        // Print the original values
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the values of a and b
        int temp = a;
        a = b;
        b = temp;

        // Print the swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
