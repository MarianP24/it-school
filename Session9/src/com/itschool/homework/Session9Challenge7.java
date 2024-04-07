package com.itschool.homework;

import java.time.LocalDate;

public class Session9Challenge7 {
    public static void main(String[] args) {
        Session9Challenge7 run = new Session9Challenge7();
        int weekNr = 4;
        run.addWeeksToToday(weekNr);
    }

    public void addWeeksToToday(int weekNr) {
        LocalDate date = LocalDate.now();
        date = date.plusWeeks(weekNr);
        System.out.println(weekNr + " weeks from now on is " + date);
    }
}
