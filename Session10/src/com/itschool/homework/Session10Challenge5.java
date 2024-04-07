package com.itschool.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Session10Challenge5 {
    public static void main(String[] args) {
        Session10Challenge5 run = new Session10Challenge5();
        run.challengeRun5();
    }

    public void challengeRun5() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Timisoara");
        cities.add("Cluj");
        cities.add("Bucuresti");
        cities.add("Iasi");
        cities.add("Targu-Jiu");
        System.out.println(cities);
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a city name to the list");
        String cityNameGiven = input.next();
        if (cities.contains(cityNameGiven)) {
            System.out.println("City name given is already in the list");
        } else {
            cities.add(cityNameGiven);
        }
        System.out.println(cities);
    }
}
