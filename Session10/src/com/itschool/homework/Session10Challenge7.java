package com.itschool.homework;

import java.util.ArrayList;
import java.util.Comparator;

public class Session10Challenge7 {
    public static void main(String[] args) {
        Session10Challenge7 run = new Session10Challenge7();
        run.challengeRun7();
    }

    public void challengeRun7() {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("mar");
        fruitList.add("banana");
        fruitList.add("para");
        fruitList.add("kiwi");
        fruitList.add("afina");
        fruitList.add("gref");
        System.out.println(fruitList);
        fruitList.sort(Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println("Sorted list by length:");
        System.out.println(fruitList);
    }
}
