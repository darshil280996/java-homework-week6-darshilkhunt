package javahomeworkweek6darshilkhunt;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program4MixedVariables2 {
    // Step 4.1: Declare two instance and two static variables

    int v1instance;
    String v2instance;

    static double v1static;

    static boolean v2static;

    // 4.2 Declare one instance method
    public void m1instance() {
        // 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
        System.out.println("Inside Instance Method:");
        System.out.println("Instance Variable 1:" + v1instance);
        System.out.println("Instance Variable 2:" + v2instance);
        System.out.println("Static Variable 1:" + v1static);
        System.out.println("Static Variable 2:" + v2static);
    }

    // Step 4.3: Declare one static method

    public static void m2static() {
        // 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
        System.out.println("Inside Static Method:");

        Program4MixedVariables2 c1 = new Program4MixedVariables2();
        System.out.println("Instance Variable 1:" + c1.v1instance);
        System.out.println("Instance Variable 2:" + c1.v2instance);
        System.out.println("Static Variable 1:" + v1static);
        System.out.println("Static Variable 2:" + v2static);
    }

    // Step 4.5: Declare the Main method
    public static void main(String[] args) {
        // Step 4.6: Call both instance and static methods into the Main method and run the program

        Program4MixedVariables2 c2 = new Program4MixedVariables2();

        c2.v1instance = 42;
        c2.v2instance = "Hello Dear";
        v1static = 3.14;
        v2static = true;

        c2.m1instance();
        m2static();


    }


}
