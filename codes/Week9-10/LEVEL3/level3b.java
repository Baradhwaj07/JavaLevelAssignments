// Program to find the frequency of characters in a string using a 2D array

import java.util.Scanner;

class level3b {
    // Method to find the frequency of characters and return in a 2D array
    public String[][] findFrequency(String text) {
        int[] frequencyMap = new int[256];
        
        // Count frequencies
        for (int i = 0; i < text.length(); i++) {
            frequencyMap[text.charAt(i)]++;
        }

        // Count unique characters to size the 2D array
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequencyMap[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array: [uniqueCount][2]
        String[][] frequencies = new String[uniqueCount][2];
        int index = 0;
        
        // Fill the 2D array (preserving order of appearance)
        boolean[] processed = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!processed[ch]) {
                frequencies[index][0] = String.valueOf(ch);
                frequencies[index][1] = String.valueOf(frequencyMap[ch]);
                processed[ch] = true;
                index++;
            }
        }
        
        return frequencies;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        level3b obj = new level3b();
        String[][] result = obj.findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------\t---------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        scanner.close();
    }
}
