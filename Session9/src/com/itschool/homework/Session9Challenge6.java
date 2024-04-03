package com.itschool.homework;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Session9Challenge6 {
    public static void main(String[] args) {
        Session9Challenge6 run = new Session9Challenge6();
        run.displayCurrentTime();
    }

    public void displayCurrentTime() {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = localTime.format(formatTime);
        System.out.println("Current time: " + time);
    }
}
