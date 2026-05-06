// Program to compare two strings using the charAt() method and check the result with the built-in String equals() method

import java.util.Scanner;

class level1a {
    // Method to compare two strings using charAt() method
    public boolean compareStrings(String s1, String s2) {
        // If lengths are not equal, strings are not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // Create object of level1a class
        level1a comparator = new level1a();

        // Compare using user-defined method
        boolean customResult = comparator.compareStrings(str1, str2);

        // Compare using built-in equals() method
        boolean builtInResult = str1.equals(str2);

        // Display the result
        System.out.println("\nComparison using charAt() method: " + customResult);
        System.out.println("Comparison using built-in equals() method: " + builtInResult);

        // Check if both results are the same
        if (customResult == builtInResult) {
            System.out.println("The results of both methods are the same.");
        } else {
            System.out.println("The results of both methods are different.");
        }

        scanner.close();
    }
}
