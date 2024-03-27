package com.itschool.homework;

public class Session8Challenge13 {
    public static void main(String[] args) {
        Session8Challenge13 run = new Session8Challenge13();
        String compressedString = "a3b2c4";
        System.out.println(compressedString);
        System.out.println("Expanded string: " + run.expandString(compressedString));
    }

    public String expandString(String compressedString) {
        StringBuilder newString = new StringBuilder();
        int i = 0;

        while (i < compressedString.length()) {
            char a = compressedString.charAt(i);
            int count = 0;
            i++;
            while (i < compressedString.length() && Character.isDigit(compressedString.charAt(i))) {
                // convertesc caracterul digit in valoare numerica folosind codul ascii
                count = compressedString.charAt(i) - '0';
                i++;
            }

            for (int j = 0; j < count && newString.length() < compressedString.length(); j++) {
                newString.append(a);
            }
        }
        return newString.toString();
    }
}
