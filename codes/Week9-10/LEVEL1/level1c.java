// Program to return all the characters in a string without using the built-in toCharArray() method

import java.util.Scanner;
import java.util.Arrays;

class level1c {
    // Method to return characters in a string without using toCharArray()
    public char[] getChars(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    // Method to compare two string arrays (actually char arrays in this context)
    public boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the text: ");
        String text = scanner.next();

        // Create object of level1c class
        level1c obj = new level1c();

        // Get characters using user-defined method
        char[] customChars = obj.getChars(text);

        // Get characters using built-in toCharArray() method
        char[] builtInChars = text.toCharArray();

        // Display results
        System.out.println("\nCharacters using user-defined method: " + Arrays.toString(customChars));
        System.out.println("Characters using built-in method: " + Arrays.toString(builtInChars));

        // Compare the two arrays
        boolean areEqual = obj.compareArrays(customChars, builtInChars);

        if (areEqual) {
            System.out.println("The two character arrays are equal.");
        } else {
            System.out.println("The two character arrays are not equal.");
        }

        scanner.close();
    }
}
