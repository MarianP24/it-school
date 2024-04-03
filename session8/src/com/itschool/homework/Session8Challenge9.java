package com.itschool.homework;

import java.util.HashSet;

public class Session8Challenge9 {
    public static void main(String[] args) {
        Session8Challenge9 run = new Session8Challenge9();
        run.challengeRun9();
    }

    public void challengeRun9() {
        StringBuilder text = new StringBuilder("Let's gooo!");
        HashSet<Character> processedChars = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            int characterAppereance = 0;
            if (processedChars.contains(character) || character == ' ') {
                continue;
            }
            for (int j = 0; j < text.length(); j++) {
                if (character == text.charAt(j)) {
                    characterAppereance++;
                }
            }
            processedChars.add(character);
            System.out.println(character + " appears " + characterAppereance + " times in the " + text);
        }
    }

}
