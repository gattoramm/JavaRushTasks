package com.javarush.task.task10.task1013;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String lastName;
        private int age;
        private int height;
        private int weight;
        private Human mother;
        private Human father;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public Human(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, int height, int weight, Human mother) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.mother = mother;
        }

        public Human(String name, int age, int height, int weight, Human mother, Human father) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.mother = mother;
            this.father = father;
        }

        public Human(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        public Human(int age, int height, int weight) {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, Human mother, Human father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        public Human(Human mother, Human father) {
            this.mother = mother;
            this.father = father;
        }
    }
}
