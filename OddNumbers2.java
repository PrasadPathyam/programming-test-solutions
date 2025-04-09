import java.util.*;

public class Od {
    public static void main(String args[]) {
        // Create a scanner object to take input from the user
        Scanner S = new Scanner(System.in);
        
        // Read the input integer 'a' from the user
        int a = S.nextInt();
        
        // Variable to count how many odd numbers we have printed
        int count = 0;
        
        // Start with the first odd number (1) and keep incrementing by 2 to get the next odd number
        for (int i = 1; count < a; i += 2) {
            // Print the odd number and separate with a comma if it's not the last one
            System.out.print(i);
            
            // Increment the count
            count++;
            
            // Print a comma if there are more numbers to print
            if (count < a) {
                System.out.print(", ");
            }
        }
        
        // Move to the next line after printing all the odd numbers
        System.out.println();
    }
}
/// Thank You
