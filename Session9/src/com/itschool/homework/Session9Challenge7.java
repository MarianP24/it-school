package com.itschool.homework;

public class Session9Challenge7 {
    public static void main(String[] args) {
        Session9Challenge7 run = new Session9Challenge7();
        run.challengeRun7();
    }

    public void challengeRun7() {
        StringBuilder dupli = new StringBuilder("Football challenge");
        System.out.println(dupli);
        for (int i = 0; i < dupli.length() - 1; i++)
            if (dupli.charAt(i) == dupli.charAt(i + 1)) {
                dupli.deleteCharAt(i);
            }
        System.out.println(dupli);
    }
}
