package com.itschool.homework;

import java.time.LocalDate;

public class Session9Challenge5 {
    public static void main(String[] args) {
        Session9Challenge5 run = new Session9Challenge5();
        run.isTodaySpecificDate();
    }

    public void isTodaySpecificDate() {
        LocalDate todaysDate = LocalDate.of(2019, 12, 10);
        LocalDate actualDate = LocalDate.now();
        System.out.println("Today's date is 10.12.2019?");
        System.out.println(todaysDate.equals(actualDate));
        System.out.println("Because actual date is: " + actualDate);
    }
}
