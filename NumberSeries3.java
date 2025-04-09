import java.util.*;

public class NumberSeries {
    public static void main(String args[]) {
        // Create a scanner object to take input from the user
        Scanner S = new Scanner(System.in);

        // Read the integer input 'a' from the user
        int a = S.nextInt();

        // Check if the input 'a' is even or odd
        if (a % 2 == 0) {
            // If 'a' is even, generate the odd numbers in the range
            // Start the loop from 1 and go up to a*2 - 2
            for (int i = 1; i < a * 2 - 2; i++) {
                // Only print odd numbers
                if (i % 2 != 0) {
                    System.out.println(i); // Print the odd number
                }
            }
        } else {
            // If 'a' is odd, generate the odd numbers in the range
            // Start the loop from 1 and go up to a*2
            for (int i = 1; i <= a * 2; i++) {
                // Only print odd numbers
                if (i % 2 != 0) {
                    System.out.println(i); // Print the odd number
                }
            }
        }
    }
}
//Thank you
