package com.itschool.homework;

public class HomeRunChallenge4 {
    public static void main(String[] args) {
        HomeRunChallenge4 home = new HomeRunChallenge4();
        challengeRun4();
    }
    static void challengeRun4(){
        int heightOne = 100;
        int heightTwo = 120;
        int maximumHeight = (heightOne > heightOne) ? heightOne : heightTwo;
        System.out.println(maximumHeight);
    }
}
