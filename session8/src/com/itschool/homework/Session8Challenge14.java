package com.itschool.homework;

import java.util.Scanner;

public class Session8Challenge14 {
    public static void main(String[] args) {
        Session8Challenge14 run = new Session8Challenge14();
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your code in order to remove the comments");
        String text = input.nextLine();
        System.out.println(run.removeComment(text));
        // works on: abc// asdas/ asda/* asdasda*/ asdad/
    }

    public String removeComment(String text) {
        StringBuilder newText = new StringBuilder();
        int i = 0;

        while (i < text.length() - 1) {
            char a = text.charAt(i);
            char b = text.charAt(i + 1);

            if ((a == '/' && b == '/') || (a == '/' && b == '*') || (a == '*' && b == '/')) {
                i++;
            } else {
                newText.append(a);
            }
            i++;
        }
        char lastChar = text.charAt(text.length() - 1);
        newText.append(lastChar);
        return newText.toString();
    }
}
