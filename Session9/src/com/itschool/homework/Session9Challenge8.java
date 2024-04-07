package com.itschool.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Session9Challenge8 {
    public static void main(String[] args) {
        Session9Challenge8 run = new Session9Challenge8();
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a date YYYY-MM-DD");
        String inputDate = input.nextLine();
        String dayOfWeek = run.findDayOfWeek(inputDate);
        System.out.println(dayOfWeek);
    }

    public String findDayOfWeek(String inputDate) {
        LocalDate localDate = LocalDate.parse(inputDate);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString();
    }
}
