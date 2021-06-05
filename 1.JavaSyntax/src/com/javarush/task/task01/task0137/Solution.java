package com.javarush.task.task01.task0137;

public class Solution {
    // объявляем переменную a типа int и сразу же в строке объявления
    // присваиваем ей значение
    public static int a = 1;
    // объявляем переменную b типа int и сразу же в строке объявления
    // присваиваем ей значение
    public static int b = 3;
    // объявляем переменную c типа int и сразу же в строке объявления
    // присваиваем ей значение
    public static int c = 9;
    // объявляем переменную d типа int и сразу же в строке объявления
    // присваиваем ей значение
    public static int d = 27;

    public static void main(String[] args) {
        // объявляем переменную result типа int и сразу же в строке объявления
        // присваиваем ей значение - результат вычисления выражения -a + b - c + d
        int result = -a + b - c + d;

        // выводим на экран значение переменной result
        System.out.println(result);
    }
}