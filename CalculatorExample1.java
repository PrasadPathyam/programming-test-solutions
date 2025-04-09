import java.util.*;

public class A {

    public static void main(String args[]) {
        // Create a scanner object to take input from the user
        Scanner S = new Scanner(System.in);

        // Read two double values from the user
        Double a = S.nextDouble();  // First number (a)
        Double b = S.nextDouble();  // Second number (b)
        
        // Consume the newline character after reading the numbers
        S.nextLine();

        // Prompt the user to enter the type of operation they want to perform
        System.out.println(" Enter the Type Of Operation(Addition, Subtraction, Multiplication, Division)");

        // Read the operation type as a string
        String n = S.nextLine();

        // Check if the operation is Addition
        if (n.equals("Addition")) {
            Double D = a + b;  // Perform addition
            System.out.println(D);  // Print the result of the addition
        }
        // Check if the operation is Subtraction
        else if (n.equals("Subtraction")) {
            Double D = a - b;  // Perform subtraction
            System.out.println(D);  // Print the result of the subtraction
        }
        // Check if the operation is Multiplication
        else if (n.equals("Multiplication")) {
            Double D = a * b;  // Perform multiplication
            System.out.println(D);  // Print the result of the multiplication
        }
        // Check if the operation is Division
        else if (n.equals("Division")) {
            // Check if the second number (b) is not zero before performing division
            if (b != 0) {
                Double D = a / b;  // Perform division
                System.out.println(D);  // Print the result of the division
            } else {
                System.out.println("Error");  // If division by zero, print error message
            }
        } else {
            // If the input operation is not valid, print an error message
            System.out.println("Invalid Input");
        }
    }
}
// The End Of The Prgm Thank You 
