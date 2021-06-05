package com.javarush.task.task05.task0517;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public Cat(String name) {
        this.age = 5;
        this.name = name;
        this.weight = 5;
        this.color = "White";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Red";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "Grey";
    }

    public Cat(int weight, String color) {
        this.age = 5;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.age = 5;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
