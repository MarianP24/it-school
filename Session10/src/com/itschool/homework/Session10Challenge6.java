package com.itschool.homework;

import java.util.LinkedList;
import java.util.Scanner;

public class Session10Challenge6 {
    public static void main(String[] args) {
        Session10Challenge6 run = new Session10Challenge6();
        run.challengeRun6();
    }

    public void challengeRun6() {
        LinkedList<String> nameList = new LinkedList<>();
        nameList.add("Ion");
        nameList.add("Vasile");
        nameList.add("Gheorghe");
        Scanner input = new Scanner(System.in);
        System.out.println(nameList);
        System.out.println("Give me a name to check on the student list");
        String studentName = input.next();
        if (nameList.contains(studentName)) {
            nameList.remove(studentName);
        }
        System.out.println(nameList);
    }
}
