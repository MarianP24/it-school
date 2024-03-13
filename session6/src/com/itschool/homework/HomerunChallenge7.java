package com.itschool.homework;

public class HomerunChallenge7 {
    public static void main(String[] args) {
        HomerunChallenge7 home = new HomerunChallenge7();
        home.challengeRun7();
    }
    public void challengeRun7(){
        int a = 2;
        int b = 2;
        int c = 2;
        String triangleType1 = (a == b && b == c) ? "Equilateral" : (a == b || a == c || b == c) ? "Isoscel" : "Scalene";
        System.out.println("Triangle " + triangleType1);
    }
}
