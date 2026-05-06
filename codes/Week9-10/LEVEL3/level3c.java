// Program to find the frequency of characters in a string using unique characters method

import java.util.Scanner;

class level3c {
    // Method to find unique characters using nested loops
    public char[] uniqueCharacters(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            boolean found = false;
            for (int j = 0; j < unique.length(); j++) {
                if (text.charAt(i) == unique.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique += text.charAt(i);
            }
        }
        
        char[] uniqueArr = new char[unique.length()];
        for (int i = 0; i < unique.length(); i++) {
            uniqueArr[i] = unique.charAt(i);
        }
        return uniqueArr;
    }

    // Method to find frequency and return in 2D array
    public String[][] findFrequency(String text) {
        int[] freqMap = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freqMap[text.charAt(i)]++;
        }

        // Call uniqueCharacters() method
        char[] unique = uniqueCharacters(text);

        // Create 2D array to store unique characters and their frequencies
        String[][] frequencies = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            frequencies[i][0] = String.valueOf(unique[i]);
            frequencies[i][1] = String.valueOf(freqMap[unique[i]]);
        }
        
        return frequencies;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        level3c obj = new level3c();
        String[][] result = obj.findFrequency(text);

        System.out.println("\nUnique Character\tFrequency");
        System.out.println("----------------\t---------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t\t" + result[i][1]);
        }

        scanner.close();
    }
}
