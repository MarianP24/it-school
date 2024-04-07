package com.itschool.course;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        sortArray();
    }

    private static void lightArray() {
        int[] intArray = {1, 2, 3};
        int[] zeroArray = new int[4];
        String[] stringArray = {"ala", "bala", "portocala"};
        String[] nullStringArray = new String[5];

        //Arrays clasa, toString metoda, apelez metoda toString din clasa Arrays
        System.out.println(Arrays.toString(zeroArray));
        System.out.println(Arrays.toString(nullStringArray));

        String[] arrayWithNewAndFixed = new String[] {"ala", "bala", "portocala"};
    }

    private static void sortArray() {
        String[] cities = {"Iasi", "Bucuresti", "Cluj"};
        System.out.println(Arrays.toString(cities));

        String[] citiesCopied = Arrays.copyOf(cities, cities.length);


        Arrays.sort(cities);
        System.out.println("Natural sorted cities");
        System.out.println(Arrays.toString(cities));

        System.out.println("index of Bucuresti is:");
        int index = Arrays.binarySearch(cities,"Bucuresti");
        System.out.println(index);

        Arrays.sort(cities, (o1, o2) -> Character.valueOf(o2.charAt(0)).compareTo(o1.charAt(0)));
        System.out.println("Reversed natural order of cities");
        System.out.println(Arrays.toString(cities));

        System.out.println("Copied cities");
        System.out.println(Arrays.toString(citiesCopied));

        System.out.println("Index of Bucuresti in usorted array");
        int index2 = Arrays.binarySearch(citiesCopied,"Bucuresti");
        System.out.println(index2);


    }
}
