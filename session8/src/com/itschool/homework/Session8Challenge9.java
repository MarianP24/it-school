package com.itschool.homework;

public class Session8Challenge9 {
    public static void main(String[] args) {
        Session8Challenge9 run = new Session8Challenge9();
        run.challengeRun9();
    }

    public void challengeRun9() {
        StringBuilder text = new StringBuilder("Let's gooo!");

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            int characterAppereance = 0;
            if (character == ' ') {
                continue;
            }
            for (int j = 0; j < text.length(); j++) {
                if (character == text.charAt(j)) {
                    characterAppereance++;
                }
            }
            System.out.println(character + " appears " + characterAppereance + " times in the " + text);
        }
    }

}
