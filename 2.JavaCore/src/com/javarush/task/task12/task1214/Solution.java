package com.javarush.task.task12.task1214;


public class Solution {
    public static void main(String[] args) {
        Animal animal = new Cow();
        System.out.println(animal.getName());
    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {

        public String getName() {
            return "Корова";
        }
    }
}
