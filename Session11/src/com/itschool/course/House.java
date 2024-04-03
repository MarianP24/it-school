package com.itschool.course;

public class House {
    private String color;
    private int mp;


    //constructor
    public House(String color, int mp) {
        this.color = color;
        this.mp = mp;
    }

    public String getColor() {
        return color;
    }

    public int getMp() {
        return mp;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
