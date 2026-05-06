// Program to find the first non-repeating character in a string

import java.util.Scanner;

class level3a {
    // Method to find the first non-repeating character
    public char findFirstNonRepeating(String text) {
        // Array to store frequency of 256 ASCII characters
        int[] frequency = new int[256];

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Loop through the text again to find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null char if no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        level3a obj = new level3a();
        char result = obj.findFirstNonRepeating(text);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
