package com.itschool.homework;

import java.util.Scanner;

public class Challenges {
    static void challenge1(){
        System.out.println("Raspuns challenge1:");
        //Binary Arithmetic Operators:
        int a, b, length, breadth, area;
        int addition = 0;
        int multiplication = 0;
        int subtraction = 0;
        int division = 0;
        int modulus = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert first number: ");
        a = input.nextInt();
        System.out.println("Please insert second number: ");
        b = input.nextInt();
        addition = a + b;
        subtraction = a - b;
        multiplication = a * b;
        division = a/b;
        modulus = a%b;
        System.out.println("Addition of the 2 numbers is: " + addition);
        System.out.println("Subtraction of the 2 numbers is: " + subtraction);
        System.out.println("Division of the 2 numbers is: " + division);
        System.out.println("Multiplication of the 2 numbers is: " + multiplication);
        System.out.println("Modulus of the 2 numbers is: " + modulus);

        System.out.println("Insert length of the rectangle");
        length = input.nextInt();
        System.out.println("Insert breadth of the rectangle");
        breadth = input.nextInt();
        area = length * breadth;
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
        boolean a, b;
        int c, d;
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert first integer value:");
        c = input.nextInt();
        if(c >= 0){
            System.out.println("Your inserted integer value is positive");
        }
        else {
            System.out.println("Your inserted integer value is negative");
        }
        System.out.println("Please insert second integer value:");
        d = input.nextInt();
        if(d >= 0){
            System.out.println("Your inserted integer value is positive");
        }
        else {
            System.out.println("Your inserted integer value is negative");
        }

        System.out.println("Please insert a boolean value:");
        a = input.nextBoolean();
        System.out.println("Please insert second boolean value:");
        b = input.nextBoolean();
        a = !a;
        b = !b;
        System.out.println("Applied logical operator ! to first boolean value results: " + a);
        System.out.println("Applied logical operator ! to second boolean value results: " + b);
    }
    static void challenge4(){
        System.out.println("Raspuns challenge4:");
        //Increment and decrement Operators
        int a;
        for (a=1; a<=10; a++)
            System.out.println(a);
        for (a=10; a>=0; a--)
            System.out.println(a);
    }
    static void challenge5(){
        System.out.println("Raspuns challenge5:");
        //Assignment and Compound Assignment Operators
        Scanner input = new Scanner(System.in);
        int a, b, c, d, f, k, l, m, n, procentaj;
        float price, newprice, pricediscount, discount;
        a = 5;
        b = 2;
        c = 4;
        d = 1;
        f = 10;
        k = l = m = n = 5;
        a = b;
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
        //shits the l bynary with 1 bit to the left
        l <<= 1;
        System.out.println(l);
        //shifts the m binary with 1 bit to the right side
        m >>= 1;
        System.out.println(m);
        //logical right shift, does not keep the sign if any
        n >>>= 2;
        System.out.println(n);

        System.out.println("Pretul unui pix este:");
        price = input.nextFloat();
        System.out.println("Cu cat % vrei sa micesti pretul pixului?");
        procentaj = input.nextInt();
        System.out.println("Pretul se micsoreaza cu " + procentaj + "%");
        discount = price * procentaj / 100;
        //unde folosesc compound assignment-------------------------------------????-------
        newprice = price - discount;
        System.out.println("Noul pret este: " + newprice);
    }
    static void challenge6(){
        System.out.println("Raspuns challenge6:");
        //Relational Operators
        Scanner input = new Scanner(System.in);
        int a, b, lowerRange, upperRange, numar;
        System.out.println("Insert first number");
        a = input.nextInt();
        System.out.println("Insert second number");
        b = input.nextInt();
        if (a<b)
            System.out.println("Primul numar este mai mic decat cel de-al doilea");
        if (a>b)
            System.out.println("Primul numar este mai mare decat cel de-al doilea");
        if (a==b)
            System.out.println("Cele doua numere sunt egale");

        System.out.println("Introdu lowerRange");
        lowerRange = input.nextInt();
        System.out.println("Introdu upperRange");
        upperRange = input.nextInt();
        System.out.println("Introdu un numar");
        numar = input.nextInt();;

        if (numar<=upperRange && numar >=lowerRange) {
            System.out.println("Numarul este intre cele doua limite");
        }
        else {
            System.out.println("Numarul nu este in intervalul dat");
        }
    }
    static void challenge7(){
        System.out.println("Raspuns challenge7:");
        //Numeric Promotion
        short ab = 40, ac = 60, sum1;
        int a = 10;
        double b = 50.200001d, sum2;
        sum2 = a + b;
        //a += b;
        System.out.println(sum2);
        //arithmetic operations on short, byte, char are automatically promoted to int if used in an expression
        //sum1 = ab + ac;
        sum1 = (short)(ab+ac);
        System.out.println(sum1);
    }
}
