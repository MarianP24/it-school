package com.itschool.homework;

import java.time.LocalDate;

public class Session9Challenge3 {
    public static void main(String[] args) {
        Session9Challenge3 run = new Session9Challenge3();
        run.createSpecificDate();
    }

    public void createSpecificDate() {
        LocalDate date = LocalDate.of(2025, 8, 19);
        System.out.println(date);
    }
}
