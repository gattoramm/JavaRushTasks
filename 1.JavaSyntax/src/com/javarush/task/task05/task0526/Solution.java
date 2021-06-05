package com.javarush.task.task05.task0526;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Oleg", 23, "New-York, 228 Park Ave");
        Man man2 = new Man("Senya", 15, "Seattle, 132 5th Ave");
        Woman woman1 = new Woman("Latya", 35, "California, 233 Center Street");
        Woman woman2 = new Woman("Kristina", 23, "Springfield, 12 6th Street");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }
}