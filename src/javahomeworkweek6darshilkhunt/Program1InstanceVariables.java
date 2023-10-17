package javahomeworkweek6darshilkhunt;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Program1InstanceVariables {

    //  Step 1.1: Declare two instance variables

    int variable1;
    String variable2;

    // Step 1.2: Declare one instance method

    public void printInstanceVariables() {

        // Step 1.3: Call both instance variables into the instance method inside the print statement

        System.out.println("Instance Variable 1:" + variable1);
        System.out.println("Instance Variable 2:" + variable2);
    }

    // Step 1.4: Declare the Main method

    public static void main(String[] args) {

        // create an instance of the class

        Program1InstanceVariables e1 = new Program1InstanceVariables();

        // Step 1.5: Call the above instance method into the Main method and run the program

        e1.variable1 = 40;
        e1.variable2 = "Hello Everyone";
        e1.printInstanceVariables();

    }
}
