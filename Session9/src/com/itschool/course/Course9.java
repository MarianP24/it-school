package com.itschool.course;

import java.time.LocalDate;
import java.time.Month;

public class Course9 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int dayOfYear = localDate.getDayOfYear();
        System.out.println(dayOfYear);

        LocalDate dateOfBirth = LocalDate.of(1991,10,11);
        System.out.println(dateOfBirth);
        System.out.println(LocalDate.now());

        LocalDate dateOfBirthWithMonth = LocalDate.of(2000, Month.NOVEMBER,4);
        System.out.println(dateOfBirthWithMonth);
    }
}
