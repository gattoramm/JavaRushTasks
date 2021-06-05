package com.javarush.task.task02.task0219;

public class Solution {
    // метод print3 выводит 3 раза на экран строку, переданную в качестве
    // параметра метода, через пробел
    public static void print3(String text) {
        // выводим на экран значение переменной text три раза разделяя пробелом
        System.out.println(text + " " + text + " " + text);
    }

    public static void main(String[] args) {
        // вызываем метод print3 со значением аргумента "window"
        print3("window");
        // вызываем метод print3 со значением аргумента "file"
        print3("file");
    }
}
