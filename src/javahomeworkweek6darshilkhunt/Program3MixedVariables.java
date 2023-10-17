package javahomeworkweek6darshilkhunt;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3MixedVariables {
    // Step 3.1: Declare one instance and one static variable

    int a1instance;
    static String a2static;

    // Step 3.2: Declare one instance method

    public void m1instance(){
        // Step 3.4: Call both instance and static variables into the instance method inside the print statement

        System.out.println( "Inside Instance Method: ");
        System.out.println( "Instance Variable:" + a1instance);
        System.out.println( "Static Variable:" + a2static);
    }

    // Step 3.3: Declare one static method
    public static void m2static(){
        // Step 3.4: Call both instance and static variables into the static method inside the print statement
        System.out.println("Inside Static Method:");

        // You cannot access instance variables directly in a static method, so we'll access them through an instance of the class.

        Program3MixedVariables i1 = new Program3MixedVariables();
        System.out.println("Instance Variables:" + i1.a1instance);
        System.out.println("Static Variables" + a2static);
    }

    // Step 3.5: Declare the Main method
    public static void main(String[] args) {
        // Step 3.6: Call both instance and static methods into the Main method and run the program

        Program3MixedVariables i1 = new Program3MixedVariables();

        i1.a1instance = 10;
        a2static = "Welcome";

        i1.m1instance();
        m2static();
    }

}
