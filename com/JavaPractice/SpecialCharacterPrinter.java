package com.JavaPractice;

public class SpecialCharacterPrinter {
    public static void main(String[] args) {
        String str = "ajayk_kumar@gmail.com";

        System.out.println("Special characters in the string:");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a special character
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.print(ch + " ");
            }
        }
    }
}

