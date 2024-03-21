package com.itschool.course;

public class SwitchSeason {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season){
//            case AUTUMN:
//                System.out.println("The leafs are falling");
//                break;
//            case WINTER:
//                System.out.println("Is snowing");
//                break;
//            case SPRING:
//                System.out.println("The flowers are green");
//                break;
//            case SUMMER:
//                System.out.println("I am on the beach!");
//                break;
//            default:
//                System.out.println("Unknown season");
            case AUTUMN -> System.out.println("The leafs are falling");
            case WINTER -> System.out.println("Is snowing");
            case SPRING -> System.out.println("The flowers are green");
            case SUMMER -> System.out.println("I am on the beach!");
            default -> System.out.println("Unknown season");
        }
    }
}
