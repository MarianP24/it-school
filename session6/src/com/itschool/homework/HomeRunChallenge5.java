package com.itschool.homework;

public class HomeRunChallenge5 {
    public static void main(String[] args) {
        HomeRunChallenge5 home = new HomeRunChallenge5();
        home.challengeRun5();
    }

    public void challengeRun5() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int b = 1; b <= 10; b++) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }
    }
}
