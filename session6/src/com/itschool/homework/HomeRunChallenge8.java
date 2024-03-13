package com.itschool.homework;

public class HomeRunChallenge8 {
    public static void main(String[] args) {
        HomeRunChallenge8 home = new HomeRunChallenge8();
        home.challengeRun8();
    }
    //daca rulez pe diferite valori ale lui a crapa intelij, da crash :|
    //ce pot face sa-l optimizez sa nu mai foloseasca atata memorie
    public void challengeRun8(){
        int b = 1;
        for (int a = 1; a <= 8; a++){
            b *= a;
        }
        System.out.println(b);
    }
}
