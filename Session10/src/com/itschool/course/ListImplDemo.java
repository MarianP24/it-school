package com.itschool.course;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListImplDemo {
    public static void main(String[] args) {
        arrayListDemo();
    }

    private static void arrayListDemo() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Marian");
        arrayList.add("Ionutz");
        arrayList.remove("Marian");

        System.out.println(arrayList);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(10);

        System.out.println(intList);
        System.out.println(intList.isEmpty());
        System.out.println(intList.size());
        System.out.println(intList.contains(12));
    }

    private static void linkedListDemo() {
        LinkedList<String> linkedList = new LinkedList<>();
        //linkedList
    }
}
