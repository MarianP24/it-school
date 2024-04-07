package com.itschool.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Session9Challenge9 {
    public static void main(String[] args) {
        Session9Challenge9 run = new Session9Challenge9();
        run.daysBetween();
    }

    public void daysBetween() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert first date in format YYYY-MM-DD");
        String firstDateString = input.nextLine();
        System.out.println("Please insert second date in format YYYY-MM-DD");
        String secondDateString = input.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateString);
        LocalDate secondDate = LocalDate.parse(secondDateString);
        long daysBetween = Math.abs(ChronoUnit.DAYS.between(firstDate,secondDate));
        System.out.println(daysBetween);
    }
}
