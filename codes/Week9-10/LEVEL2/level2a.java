// Program to find the length of a string without using the built-in length() method

import java.util.Scanner;

class level2a {
    // Method to find and return a string's length without using length()
    public int findLength(String text) {
        int count = 0;
        try {
            // Use infinite loop and charAt() until it throws StringIndexOutOfBoundsException
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
            return count;
        } catch (RuntimeException e) {
            System.out.println("Runtime error occurred: " + e.getMessage());
            return count;
        }
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the string: ");
        String text = scanner.next();

        // Create object of level2a class
        level2a obj = new level2a();

        // Find length using user-defined method
        int customLength = obj.findLength(text);

        // Find length using built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("\nLength using user-defined method (Exception handling): " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        scanner.close();
    }
}
