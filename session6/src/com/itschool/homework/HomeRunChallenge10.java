package com.itschool.homework;

import java.util.Arrays;

public class HomeRunChallenge10 {
    public static void main(String[] args) {
        HomeRunChallenge10 home = new HomeRunChallenge10();
        home.challengeRun10();
    }

    public void challengeRun10() {
        int[] listOne = {2, 2, 2, 2, 4};
        int[] listTwo = Arrays.copyOf(listOne, listOne.length);
        for (int i : listOne) {
            System.out.println("listOne: " + i);
        }
        System.out.println("-------------------");
        for (int j : listTwo) {
            System.out.println("listTwo: " + j);
        }
    }
}


