package com.javarush.task.task01.task0127;

public class Solution {
    public static void main(String[] args) {
        // объявляем переменную result типа int и сразу же в строке объявления
        // присваиваем ей значение - результат работы
        // метода sqr с параметром 5
        int result = sqr(5);
        // выводим на экран переменную result (ее значение)
        System.out.println(result);
    }

    // метод sqr, который считает квадрат числа
    public static int sqr(int a) {
        return a * a;
    }
}
