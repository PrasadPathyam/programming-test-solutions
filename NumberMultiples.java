import java.util.*;

public class NumberMultiples {
    public static void main(String[] args) {
        // Example input list
        int[] inputList = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        
        // Call the method to get the counts of multiples
        Map<Integer, Integer> result = countMultiples(inputList);
        
        // Print the result in the required format
        System.out.println(result);
    }

    // Method to count multiples of numbers 1 to 9 in the input list
    public static Map<Integer, Integer> countMultiples(int[] inputList) {
        // Initialize the map to store counts for each number from 1 to 9
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Initialize the map with keys 1 to 9 and values set to 0
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }
        
        // Loop through each number in the input list
        for (int number : inputList) {
            // Check divisibility for each number from 1 to 9
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    countMap.put(i, countMap.get(i) + 1); // Increment the count for divisor i
                }
            }
        }
        
        // Return the map containing the count of multiples for each number from 1 to 9
        return countMap;
    }
}
// Thank you
