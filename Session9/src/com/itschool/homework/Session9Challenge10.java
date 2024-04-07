package com.itschool.homework;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Session9Challenge10 {
    public static void main(String[] args) {
        Session9Challenge10 run = new Session9Challenge10();
        System.out.println(run.isValidDate());
    }

    public boolean isValidDate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a date in format YYYY-MM-DD");
        String dateString = input.nextLine();

        try {
            LocalDate.parse(dateString);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
}
