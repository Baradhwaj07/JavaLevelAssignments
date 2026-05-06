// Program to split text into words without using the built-in split() method

import java.util.Scanner;
import java.util.Arrays;

class level2b {
    // Method to find length without built-in length() (reusing logic)
    public int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words using charAt()
    public String[] splitWords(String text) {
        int length = findLength(text);
        
        // Count number of words (assume single space separation)
        int wordCount = 0;
        if (length > 0) {
            wordCount = 1;
            for (int i = 0; i < length; i++) {
                if (text.charAt(i) == ' ') {
                    wordCount++;
                }
            }
        } else {
            return new String[0];
        }

        // Store words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";
        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = currentWord;
                currentWord = "";
            } else {
                currentWord += text.charAt(i);
            }
        }
        words[wordIndex] = currentWord; // Last word
        
        return words;
    }

    // Method to compare two string arrays
    public boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input using nextLine()
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Create object
        level2b obj = new level2b();

        // Split using user-defined method
        String[] customWords = obj.splitWords(text);

        // Split using built-in method
        String[] builtInWords = text.split(" ");

        // Display results
        System.out.println("\nWords using user-defined method: " + Arrays.toString(customWords));
        System.out.println("Words using built-in split() method: " + Arrays.toString(builtInWords));

        // Compare
        boolean areEqual = obj.compareArrays(customWords, builtInWords);
        System.out.println("Arrays are equal: " + areEqual);

        scanner.close();
    }
}
