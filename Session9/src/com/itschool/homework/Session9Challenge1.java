package com.itschool.homework;

import java.util.Scanner;

public class Session9Challenge1 {
    public static void main(String[] args) {
        Session9Challenge1 run = new Session9Challenge1();
        run.challengeRun1();
    }

    public void challengeRun1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a word");
        StringBuilder run1 = new StringBuilder(input.next());
        System.out.println(run1.reverse());
    }
}
