package com.itschool.homework;

public class Session9Challenge8 {
    public static void main(String[] args) {
        Session9Challenge8 run = new Session9Challenge8();
        run.challengeRun8();
    }

    public void challengeRun8() {
        StringBuilder insertStr = new StringBuilder("Where are you going?");
        System.out.println(insertStr);
        String stringToInsert = " the hack";
        insertStr.insert(5,stringToInsert);
        System.out.println(insertStr);
    }
}
