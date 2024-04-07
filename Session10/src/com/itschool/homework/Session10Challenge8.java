package com.itschool.homework;

import java.util.Scanner;

public class Session10Challenge8 {
    public static void main(String[] args) {
        Session10Challenge8 run = new Session10Challenge8();
        run.challengeRun8();
    }

    public void challengeRun8() {
        String[] movieTitles = {"Titanic", "Shark attack1", "Shark attack2", "Never ends"};
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a movie title");
        String title = input.next();
        int position = -1;
        for (int i = 0; i < movieTitles.length; i++) {
            if (movieTitles[i].equals(title)) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("Your movie is on the list at position " + position);
        } else {
            System.out.println("Your movie title is not on the list");
        }
    }
}
