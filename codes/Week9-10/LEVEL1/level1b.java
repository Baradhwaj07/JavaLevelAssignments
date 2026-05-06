// Program to create a substring from a String using the charAt() method and compare it with the built-in substring() method

import java.util.Scanner;

class level1b {
    // Method to create a substring from a string using the charAt() method
    public String createSubstring(String text, int start, int end) {
        String substring = "";
        for (int i = start; i < end; i++) {
            substring += text.charAt(i);
        }
        return substring;
    }

    // Method to compare two strings using the charAt() method
    public boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
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

        // Take user input for string and indexes
        System.out.print("Enter the text: ");
        String text = scanner.next();
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        // Create object of level1b class
        level1b obj = new level1b();

        // Create substring using user-defined method
        String customSubstring = obj.createSubstring(text, start, end);

        // Create substring using built-in substring() method
        String builtInSubstring = text.substring(start, end);

        // Display results
        System.out.println("\nSubstring using charAt(): " + customSubstring);
        System.out.println("Substring using built-in method: " + builtInSubstring);

        // Compare using user-defined compareStrings method
        boolean areEqual = obj.compareStrings(customSubstring, builtInSubstring);

        if (areEqual) {
            System.out.println("The two substrings are equal.");
        } else {
            System.out.println("The two substrings are not equal.");
        }

        scanner.close();
    }
}
