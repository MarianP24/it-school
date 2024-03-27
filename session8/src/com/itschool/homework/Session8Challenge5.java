package com.itschool.homework;

public class Session8Challenge5 {
    public static void main(String[] args) {
        Session8Challenge5 run = new Session8Challenge5();
        run.challengeRun5();
    }

    public void challengeRun5() {
        StringBuilder capitalize = new StringBuilder("say no to war");
        boolean capitalizeNextChar = true;
        for (int i = 0; i < capitalize.length(); i++) {
            char ch = capitalize.charAt(i);
            if (Character.isWhitespace(ch)) {
                capitalizeNextChar = true;
            } else if (capitalizeNextChar) {
                capitalize.setCharAt(i, Character.toUpperCase(ch));
                capitalizeNextChar = false;
            }
        }
        System.out.println(capitalize);
    }
}
