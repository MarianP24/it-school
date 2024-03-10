package com.itschool.homework;

import java.util.Scanner;

public class Challenges {
    static void challenge1() {
        System.out.println("Raspuns challenge1:");
        //Binary Arithmetic Operators:
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert first number: ");
        int a = input.nextInt();
        System.out.println("Please insert second number: ");
        int b = input.nextInt();
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;
        System.out.println("Addition of the 2 numbers is: " + addition);
        System.out.println("Subtraction of the 2 numbers is: " + subtraction);
        System.out.println("Division of the 2 numbers is: " + division);
        System.out.println("Multiplication of the 2 numbers is: " + multiplication);
        System.out.println("Modulus of the 2 numbers is: " + modulus);
    }

    static void rectangleArea(){
        Scanner input= new Scanner(System.in);
        System.out.println("Insert length of the rectangle");
        int length = input.nextInt();
        System.out.println("Insert breadth of the rectangle");
        int breadth = input.nextInt();
        int area = length * breadth;
        System.out.println("Area of the rectangle is: " + area);
    }
    static void challenge2(){
        System.out.println("Raspuns challenge2:");
        //Unary Operators
        int a = 10;
        System.out.println("Value of variable 'a' is: " + a);
        a = ++a;
        System.out.println("Pre-Increment of variable 'a' is: " + a);
        a = --a;
        System.out.println("Pre-Decrement of variable 'a' is: " + a);
        a = -a;
        System.out.println("Variable 'a' sign reverse result is: " +a);
    }
    static void challenge3(){
        System.out.println("Raspuns challenge3:");
        //Logical Complement and Negation Operators
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert first integer value:");
        int c = input.nextInt();
        String positiveInput = "Your inserted integer value is positive";
        String negativeInput = "Your inserted integer value is negative";
        String validare = (c >= 0) ? positiveInput : negativeInput;
        System.out.println(validare);

        System.out.println("Please insert a boolean value:");
        boolean a = input.nextBoolean();
        System.out.println("Please insert second boolean value:");
        boolean b = input.nextBoolean();
        a = !a;
        b = !b;
        System.out.println("Applied logical operator ! to first boolean value results: " + a);
        System.out.println("Applied logical operator ! to second boolean value results: " + b);
    }
    static void challenge4(){
        System.out.println("Raspuns challenge4:");
        //Increment and decrement Operators
        for (int a=1; a<=10; a++)
            System.out.println(a);
        for (int a=10; a>=0; a--)
            System.out.println(a);
    }
    static void challenge5(){
        System.out.println("Raspuns challenge5:");
        //Assignment and Compound Assignment Operators
        Scanner input = new Scanner(System.in);
        int b = 2;
        int c = 4;
        int d = 1;
        int f = 10;
        int l, m, n;
        int k = l = m = n = 5;
        int a = b;
        System.out.println(a);
        b +=a;
        System.out.println(b);
        c -=d;
        System.out.println(c);
        b *=d;
        System.out.println(b);
        //division
        f /=b;
        System.out.println(f);
        //modulus
        a %=b;
        System.out.println(a);
        // AND gate bit operation
        k &=l;
        System.out.println("k1: " +k);
        // OR gate - any number XOR itself is 0
        k ^=l;
        System.out.println("k2: " +k);
        if (l != m)
            System.out.println(true);
        else
            System.out.println(false);
        //shifts the l binary with 1 bit to the left
        l <<= 1;
        System.out.println(l);
        //shifts the m binary with 1 bit to the right side
        m >>= 1;
        System.out.println(m);
        //logical right shift, does not keep the sign if any
        n >>>= 2;
        System.out.println(n);

        System.out.println("Pretul unui pix este:");
        float price = input.nextFloat();
        System.out.println("Cu cat % vrei sa micesti pretul pixului?");
        int procentaj = input.nextInt();
        System.out.println("Pretul se micsoreaza cu " + procentaj + "%");
        float discount = price * procentaj / 100;
        price -= discount;
        System.out.println("Noul pret este: " + price);
    }
    static void challenge6(){
        System.out.println("Raspuns challenge6:");
        //Relational Operators
        Scanner input = new Scanner(System.in);
        System.out.println("Insert first number");
        int a = input.nextInt();
        System.out.println("Insert second number");
        int b = input.nextInt();
        if (a < b) {
            System.out.println("Primul numar este mai mic decat cel de-al doilea");
        } else if (a > b) {
            System.out.println("Primul numar este mai mare decat cel de-al doilea");
        } else {
            System.out.println("Cele doua numere sunt egale");
        }

        System.out.println("Introdu lowerRange");
        int lowerRange = input.nextInt();
        System.out.println("Introdu upperRange");
        int upperRange = input.nextInt();
        System.out.println("Introdu un numar");
        int number = input.nextInt();;

        if (number<=upperRange && number >=lowerRange) {
            System.out.println("Numarul este intre cele doua limite");
        }
        else {
            System.out.println("Numarul nu este in intervalul dat");
        }
    }
    static void challenge7(){
        System.out.println("Raspuns challenge7:");
        //Numeric Promotion
        short ab = 40;
        short ac = 60;
        int a = 10;
        double b = 50.200001d;
        double sum2 = a + b;
        //a += b;
        System.out.println(sum2);
        //arithmetic operations on short, byte, char are automatically promoted to int if used in an expression
        //sum1 = ab + ac;
        short sum1 = (short)(ab+ac);
        System.out.println(sum1);
    }
}
