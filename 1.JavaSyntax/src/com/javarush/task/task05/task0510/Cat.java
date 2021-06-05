package com.javarush.task.task05.task0510;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "Black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "Black";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 1;
    }
}
