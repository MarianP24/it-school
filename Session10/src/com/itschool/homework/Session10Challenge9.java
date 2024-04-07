package com.itschool.homework;

public class Session10Challenge9 {
    public static void main(String[] args) {
        Session10Challenge9 run = new Session10Challenge9();
        run.challengeRun9();
    }

    public void challengeRun9() {
        String number = "110010";
        System.out.println(number);
        Integer decimalNumber = Integer.parseInt(number, 2);
        System.out.println(decimalNumber);
    }
}
