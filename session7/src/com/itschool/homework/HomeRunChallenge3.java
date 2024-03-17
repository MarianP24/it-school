package com.itschool.homework;

public class HomeRunChallenge3 {
    public static void main(String[] args) {
        HomeRunChallenge3 home = new HomeRunChallenge3();
        home.challengeRun3();
    }

    public void challengeRun3() {
        int[] array = {2, -4, 4, 8, -23, 1};
        int counter = 0;
        for (int i : array) {
            if (i < 0) {
                System.out.print(i + " ");
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);
    }
}
