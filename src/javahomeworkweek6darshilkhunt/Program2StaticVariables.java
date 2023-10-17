package javahomeworkweek6darshilkhunt;

/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Program2StaticVariables {

    // Step 2.1: Declare two static variables

    static int v1;
    static String v2;

    // Step 2.2: Declare one static method

    public static void printStaticVariables(){

        // Step 2.3: Call both static variables into the static method inside the print statement

        System.out.println( "Static Variable 1 : " + v1);
        System.out.println( "Static Variable 2 : " + v2);
    }

    // Step 2.4: Declare the Main method
    public static void main(String[] args) {
        // Step 2.5: Call the static method into the Main method and run the program

        v1 = 20;
        v2 = "Good Morning";
        printStaticVariables();
    }
}
