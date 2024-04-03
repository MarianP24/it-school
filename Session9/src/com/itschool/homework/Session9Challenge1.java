package com.itschool.homework;

import java.time.LocalDate;

public class Session9Challenge1 {
    public static void main(String[] args) {
        Session9Challenge1 run = new Session9Challenge1();
        run.displayTodaysDate();
    }

    public void displayTodaysDate() {
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
    }
}
