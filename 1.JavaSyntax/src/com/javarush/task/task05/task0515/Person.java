package com.javarush.task.task05.task0515;

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize(String name, int money, int weight, double size, char sex) {
        this.money = money;
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
