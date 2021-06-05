package com.javarush.task.task02.task0218;

public class Solution {
    // метод print3 выводит 3 раза на экран строку, переданную в качестве
    // параметра метода, каждую с новой строки
    public static void print3(String text) {
        // выводим на экран значение переменной text (3 раза)
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }

    public static void main(String[] args) {
        // вызываем метод print3 со значением аргумента "I love you!"
        print3("I love you!");
    }
}
