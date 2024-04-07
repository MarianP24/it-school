package com.itschool.homework;

public class Session8Challenge6 {
    public static void main(String[] args) {
        Session8Challenge6 run = new Session8Challenge6();
        run.challengeRun6();
    }

    public void challengeRun6() {
        StringBuilder replaceOccurrence = new StringBuilder("Daca ploua, nu ma ploua");
        System.out.println(replaceOccurrence);
        String badOne = "ploua";
        String goodOne = "ninge";
        // indexOf metoda folosita pentru a cauta prima aparitie a unui sir de caractere
        int wordPosition = replaceOccurrence.indexOf(badOne);
        while (wordPosition != -1) {
            // inlocuiesc badOne cu goodOne
            replaceOccurrence.replace(wordPosition, wordPosition + badOne.length(), goodOne);
            // actualizez wordPosition pentru a gasi urmatorea aparaitie a lui badOne
            wordPosition = replaceOccurrence.indexOf(badOne, wordPosition + goodOne.length());
        }
        System.out.println(replaceOccurrence);
    }
}
