package com.itschool.course;

import java.util.Scanner;

public class CursMain5 {
    public static void main(String[] args) {
        // & - and
        // && - and
        // | - or *verifica toate conditiile
        // || - or *daca una singura este adevarata iasa cu "true"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert boolean");
        String a = scanner.nextLine();

        boolean trueVar = true;
        boolean falseVar = true;
        // cu B mare variabila este obiect nu primitiva
        Boolean var = null;

        boolean result = trueVar || falseVar || var;

        System.out.println(result);

        System.out.println(trueVar | falseVar | var);

        //garbage collector - identifica obiectele iesite din scop si le distruge, eliberand memoria
        //memoria este divizata in stack si heap
        //in stack sunt primitivile, invocarile, var locale
        //in heap sunt boiectele
        //LIFO - Last In First Out

    }
}
