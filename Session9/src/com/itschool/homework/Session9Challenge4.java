package com.itschool.homework;

import java.util.Scanner;

public class Session9Challenge4 {
    public static void main(String[] args) {
        Session9Challenge4 run = new Session9Challenge4();
        run.areDatesEqual();
    }

    public void areDatesEqual() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert 1st date in format YYYY-MM-DD");
        String firstDate = input.nextLine();
        System.out.println("Please insert 2nd date in format YYYY-MM-DD");
        String secondDate = input.nextLine();
        System.out.println("Both dates are equal?");
        System.out.println(firstDate.equals(secondDate));
    }
}
