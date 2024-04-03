package com.itschool.homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

public class Session9Challenge2 {
    public static void main(String[] args) {
        Session9Challenge2 run = new Session9Challenge2();
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a date in format YYYY-MM-DD");
        String date = input.nextLine();
        run.displayDateComponents(date);
    }

    public void displayDateComponents(String date) {
        LocalDate localDate = LocalDate.parse(date);
        int day = localDate.getDayOfMonth();
        int year = localDate.getYear();
        Month month = localDate.getMonth();
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
