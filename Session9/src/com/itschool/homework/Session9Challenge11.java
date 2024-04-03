package com.itschool.homework;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Session9Challenge11 {
    public static void main(String[] args) {
        Session9Challenge11 run = new Session9Challenge11();
        run.elapsedTimeSince();
    }

    public void elapsedTimeSince() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a random time in HH:MM:SS format");
        LocalTime timeGiven = LocalTime.parse(input.nextLine());
        LocalTime timeNow = LocalTime.now();
        long hours = timeGiven.until(timeNow, ChronoUnit.HOURS);
        long minutes = timeGiven.until(timeNow, ChronoUnit.MINUTES) % 60;
        long seconds = timeGiven.until(timeNow, ChronoUnit.SECONDS) % 60;
        System.out.println("Elapsed time until now is " + hours + "hours " + minutes + "minutes " + seconds + "seconds");
    }
}
