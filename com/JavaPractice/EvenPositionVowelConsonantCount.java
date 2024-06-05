package com.JavaPractice;

public class EvenPositionVowelConsonantCount {
    public static void main(String[] args) {
        String str = "Get whatsapp for windows";
        int evenPositionVowels = 0, evenPositionConsonants = 0;

        // Convert the string to lowercase to handle both uppercase and lowercase characters
        str = str.toLowerCase();

        for (int i = 1; i < str.length(); i += 2) {
            char ch = str.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the letter is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    evenPositionVowels++;
                } else {
                    evenPositionConsonants++;
                }
            }
        }

        System.out.println("Number of even position vowels: " + evenPositionVowels);
        System.out.println("Number of even position consonants: " + evenPositionConsonants);
    }
}

