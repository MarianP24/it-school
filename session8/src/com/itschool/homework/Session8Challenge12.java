package com.itschool.homework;

public class Session8Challenge12 {
    public static void main(String[] args) {
        String camelString = "thisWeatherIsKillingMe";
        System.out.println(camelString);
        String resultCamelToSnake = camelToSnake(camelString);
        System.out.println(resultCamelToSnake);
    }

    public static String camelToSnake(String camelString) {
        StringBuilder toDo = new StringBuilder();
        for (int i = 0; i < camelString.length(); i++) {
            char a = camelString.charAt(i);
            if (Character.isUpperCase(a)) {
                toDo.append("_").append(Character.toLowerCase(a));
            } else {
                toDo.append(a);
            }
        }
        return toDo.toString();
    }
}
