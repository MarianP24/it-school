package com.itschool.homework;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Session9Challenge12 {
    public static void main(String[] args) {
        Session9Challenge12 run = new Session9Challenge12();
        run.convertToTimeZone();
        // input1 example: 2022-04-03 14:30:00
        // input2 example: America/New_York
        // trebuie sa mapez abrevierea EST, PST etc la fusul orar stiut de Java
    }

    public void convertToTimeZone() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert date & time in format YYYY-MM-DD HH:MM:SS");
        String dateTimeGivenString = input.nextLine();
        System.out.println("Enter time zone e.g. EET, EST, PST");
        String timeZone = input.nextLine();
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeGivenString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ZoneId zoneId = ZoneId.of(timeZone);
        LocalDateTime convertedDateTime = localDateTime.atZone(ZoneOffset.UTC).withZoneSameInstant(zoneId).toLocalDateTime();
        String formattedDateTime = convertedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(formattedDateTime);
    }
}
