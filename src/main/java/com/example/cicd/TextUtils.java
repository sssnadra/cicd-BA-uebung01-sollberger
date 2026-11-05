package com.example.cicd;

public class TextUtils {

    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String cleaned =  input.toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed); // absichtlich falsch
    }

    // Leerer Catch-Block + sehr generische Exception
    public static int safeParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) { 
            // absichtlich leer gelassen
        }
        return 0; // „Fallback“ – diskutabel
    }
}
