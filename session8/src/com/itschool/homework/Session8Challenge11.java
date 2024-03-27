package com.itschool.homework;

public class Session8Challenge11 {
    public static void main(String[] args) {
        Session8Challenge11 run = new Session8Challenge11();
        run.challengeRun11();
    }

    public void challengeRun11() {
        String text = "ABCDE";
        int rotatedBy = 3;
        String encodedText = encode(text, rotatedBy);
        System.out.println(text + " Caesar Cipher encoded by 3 is " + encodedText);
        String decodedText = decode(encodedText, rotatedBy);
        System.out.println(encodedText + " Caesar Cipher decoded by 3 is " + decodedText);
    }

    public static String encode(String text, int rotatedBy) {
        StringBuilder encodedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (Character.isLetter(character)) {
                // (char) am convertit rezultatul ce urmeaza la char
                // Character.toUpperCase(character) - 'A' + rotatedBy - scad codul ASCII al literei A
                // de la codul ASCII al literei date dandu-mi pozitia acesteia in alfabet dupa care adaug
                // cu cat vreau sa codez pozitia ei
                // calculez restul impartirii la 26 sa ma asigur ca rotatia se face circular in alfabet
                // daca depaseste 26 o ia de la inceput de la A
                char encodedChar = (char) ('A' + (Character.toUpperCase(character) - 'A' + rotatedBy) % 26);
                encodedText.append(encodedChar);
            } else {
                encodedText.append(character);
            }
        }
        return encodedText.toString();
    }

    public static String decode(String encodedText, int rotatedBy) {
        return encode(encodedText, 26 - rotatedBy);
    }
}
