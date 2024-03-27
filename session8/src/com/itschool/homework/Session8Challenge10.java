package com.itschool.homework;

import java.util.Scanner;

public class Session8Challenge10 {
    public static void main(String[] args) {
        Session8Challenge10 run = new Session8Challenge10();
        run.challengeRun10();
    }

    public static String getMorseCode(char character) {
        return switch (Character.toUpperCase(character)) {
            case 'A' -> ".-";
            case 'B' -> "-...";
            case 'C' -> "-.-.";
            case 'D' -> "-..";
            case 'E' -> ".";
            case 'F' -> "..-.";
            case 'G' -> "--.";
            case 'H' -> "....";
            case 'I' -> "..";
            case 'J' -> ".---";
            case 'K' -> "-.-";
            case 'L' -> ".-..";
            case 'M' -> "--";
            case 'N' -> "-.";
            case 'O' -> "---";
            case 'P' -> ".--.";
            case 'Q' -> "--.-";
            case 'R' -> ".-.";
            case 'S' -> "...";
            case 'T' -> "-";
            case 'U' -> "..-";
            case 'V' -> "...-";
            case 'W' -> ".--";
            case 'X' -> "-..-";
            case 'Y' -> "-.--";
            case 'Z' -> "--..";
            case ' ' -> " ";
            default -> "";
        };
    }

    public void challengeRun10() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your text");
        StringBuilder string = new StringBuilder(input.nextLine());

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            System.out.print(getMorseCode(character) + " ");
        }
    }
}

