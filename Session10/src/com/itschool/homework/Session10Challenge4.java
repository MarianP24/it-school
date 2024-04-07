package com.itschool.homework;

import java.util.Arrays;

public class Session10Challenge4 {
    public static void main(String[] args) {
        Session10Challenge4 run = new Session10Challenge4();
        run.challengeRun4();
    }

    public void challengeRun4() {
        int[] listaNumere = {2, 5, 6, 55, 8, 2, 1, 59, 7, 10};
        System.out.println(Arrays.toString(listaNumere));
        int countEven = 0;
        int countOdd = 0;
        for (int number : listaNumere) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println(countEven + " even numbers");
        System.out.println(countOdd + " odd numbers");
    }
}
