package com.javarush.task.task02.task0214;

public class Solution {
    // метод min, который определяет минимальное число среди двух чисел,
    // переданных в качестве аргументов метода, и возращает минимум в
    // качестве результата
    public static int min(int a, int b) {
        // проверяем условие a < b
        if (a < b) {
            // если a < b, то возвращаем a (оператор return предназначен
            // для возврата результата работы метода)
            return a;
        } else {
            // иначе возвращаем b
            return b;
        }
    }

    public static void main(String[] args) {
        // выводим на экран результаты вызова метода min с различными параметрами
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
