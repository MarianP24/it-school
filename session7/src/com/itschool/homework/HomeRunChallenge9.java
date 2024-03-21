package com.itschool.homework;

public class HomeRunChallenge9 {
    public static void main(String[] args) {
        HomeRunChallenge9 home = new HomeRunChallenge9();
        home.challengeRun9();
    }

    public void challengeRun9() {
        int[] array = {2, 6, 5, 8, 15, 20, 21};
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i + " Even");
            } else {
                System.out.println(i + " Odd");
            }
        }
    }
}
