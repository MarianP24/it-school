package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge21 {
    public static void main(String[] args) {
        HomeRunChallenge21 home = new HomeRunChallenge21();
        home.challengeRun21();
    }

    public void challengeRun21() {
        Scanner input = new Scanner(System.in);
        System.out.print("Student's score test is: ");
        int scoreTest = input.nextInt();
        // this was the challenge, don't blame me for this sausage line :D
        String scoreLetter = (scoreTest >= 90 && scoreTest <= 100) ? "A" : (scoreTest >= 80 && scoreTest <= 89) ? "B" : (scoreTest >= 70 && scoreTest <= 79) ? "C" : (scoreTest >= 60 && scoreTest <= 69) ? "D" : "F";
        System.out.println(scoreLetter);
    }
}
