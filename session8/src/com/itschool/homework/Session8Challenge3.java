package com.itschool.homework;

import java.util.List;

public class Session8Challenge3 {
    public static void main(String[] args) {
        Session8Challenge3 run = new Session8Challenge3();
        run.ChallengeRun3();
    }

    public void ChallengeRun3() {
        StringBuilder concatenate = new StringBuilder();
        List<String> stringList = List.of("How ","are ","you ","today","?");
        for (String listElement : stringList) {
            concatenate.append(listElement);
        }
        System.out.println(concatenate);
    }
}
