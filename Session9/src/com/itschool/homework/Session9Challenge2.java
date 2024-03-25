package com.itschool.homework;

import java.util.Scanner;

public class Session9Challenge2 {
    public static void main(String[] args) {
        Session9Challenge2 run = new Session9Challenge2();
        run.challengeRun2();
    }

    public void challengeRun2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a word");
        StringBuilder palindromeCheck = new StringBuilder(input.next());
        if (palindromeCheck.toString().equals(palindromeCheck.reverse().toString())) {
            System.out.println("Your given word is palindrome");
        } else {
            System.out.println("Your given word is not palindrome");
        }
    }
}
