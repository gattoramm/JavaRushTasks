package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?
*/

public class Solution {
    public static void main(String[] args) {
        // создаем переменную person типа Person (Person person) и объект
        // Person (new Person()) и присваиваем переменной ссылку на объект
        Person person = new Person();
    }

    // класс Person
    public static class Person {
        // объявляем переменную name типа String
        String name;
        // объявляем переменную age типа int
        int age;
        // объявляем переменную weight типа int
        int weight;
        // объявляем переменную money типа int
        int money;
    }
}
