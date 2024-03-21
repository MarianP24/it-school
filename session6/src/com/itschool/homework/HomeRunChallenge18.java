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
            //decrementez fiecare element cu 1
            array[i]--;
            // {1, 2, 3, 4, 5} elemente array
            // {0, 1, 2, 3, 4} pozitii elemente array
            // elementului de la pozitia i ii este ATRIBUITA o valoare de la pozitia i -1
            // practic shiftez elmentele array-ului la stanga cu o pozitie
            // array[i] = i -1;
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
