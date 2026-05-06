// Program to split text into words and return words with their lengths in a 2D array

import java.util.Scanner;

class level2c {
    // Method to find length without built-in length()
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

    // Method to split text into words
    public String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = (length > 0) ? 1 : 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

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
        if (wordCount > 0) words[wordIndex] = currentWord;
        return words;
    }

    // Method to return a 2D String array of words and their lengths
    public String[][] getWordsAndLengths(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        level2c obj = new level2c();
        String[] words = obj.splitWords(text);
        String[][] table = obj.getWordsAndLengths(words);

        // Display results in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("----\t\t------");
        for (int i = 0; i < table.length; i++) {
            // Convert length value from String to Integer and then display
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t\t" + length);
        }

        scanner.close();
    }
}
