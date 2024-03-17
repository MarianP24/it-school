package com.itschool.homework;

public class HomeRunChallenge18 {
    public static void main(String[] args) {
        HomeRunChallenge18 home = new HomeRunChallenge18();
        home.challengeRun18();
    }

    public void challengeRun18() {
        int[] array = new int[5];
        // foru' asta imi da pozitia
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        // asta imi afiseaza elementele din array
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = i - 1;
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
