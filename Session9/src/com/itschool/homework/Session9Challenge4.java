package com.itschool.homework;

public class Session9Challenge4 {
    public static void main(String[] args) {
        Session9Challenge4 run = new Session9Challenge4();
        run.challengeRun4();
    }

    public void challengeRun4() {
        StringBuilder remove = new StringBuilder("Let's go for a ride");
        System.out.println(remove);
        for (int i = 0; i < remove.length(); i++) {
            char ch = remove.charAt(i);
            if (isVowel(ch)) {
                remove.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(remove);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
