package com.itschool.course;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("marian");
        sb.append(" ionutz");
        sb.append(" it-school");
        StringBuilder lastStringBuilder =  sb.append(11).append(" what").append(" the").append(" biscuit");

        System.out.println(sb);
        System.out.println(lastStringBuilder);
    }
}
