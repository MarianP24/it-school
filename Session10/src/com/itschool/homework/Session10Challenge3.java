package com.itschool.homework;

import java.util.ArrayList;

public class Session10Challenge3 {
    public static void main(String[] args) {
        Session10Challenge3 run = new Session10Challenge3();
        run.challengeRun3();
    }

    public void challengeRun3() {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Ionutz");
        studentList.add("Sebi");
        studentList.add("Andreea");
        studentList.add("Alex");
        studentList.add("Mihai");
        studentList.add("Flaviu");
        studentList.add("Flavius");
        studentList.add("Mircea");
        studentList.add("Adrian");
        studentList.add("Ionut");
        ArrayList<String> graduateStudentList = new ArrayList<>(studentList);
        System.out.println(graduateStudentList);
    }
}
