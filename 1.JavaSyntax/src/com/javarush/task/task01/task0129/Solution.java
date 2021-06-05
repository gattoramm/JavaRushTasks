package com.javarush.task.task01.task0129;

public class Solution {
    public static void main(String[] args) {
        // вызываем метод printCircleLength со значением аргумента 5
        printCircleLength(5);
    }

    // метод printCircleLength принимает в качестве аргумента радиус окружности
    // radius, вычисляет длину окружности и выводит результат на экран
    public static void printCircleLength(int radius) {
        // объявляем переменную length типа double и присваиваем ей значение -
        // результат вычисления выражения 2 * 3.14 * radius
        double length = 2 * 3.14 * radius;
        // выводим на экран значение переменной length
        System.out.println(length);
    }
}