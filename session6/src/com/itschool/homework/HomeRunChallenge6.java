package com.itschool.homework;

public class HomeRunChallenge6 {
    public static void main(String[] args) {
        HomeRunChallenge6 home = new HomeRunChallenge6();
        home.challengeRun6();
    }

    public void challengeRun6() {
        int temperature = 12;
        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
