package com.javarush.task.task02.task0201;

/* 
Реализуем метод print
*/

public class Solution {

    public static void main(String[] args) {
        // вызов метода print с разными строками в качестве параметра
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    // метод print, который 4 раза выводит на экран строку, переданную в
    // качестве аргумента метода
    public static void print(String text) {
        // выводим значение переменной text (аргумента метода) на экран 4 раза
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }
}
