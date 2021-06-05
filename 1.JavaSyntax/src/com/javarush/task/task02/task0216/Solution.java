package com.javarush.task.task02.task0216;

public class Solution {
    // метод min, который определяет минимальное число среди трех чисел,
    // переданных в качестве аргументов метода, и возращает минимум в
    // качестве результата
    public static int min(int a, int b, int c) {
        // проверяем условие a <= b И a <= c
        if (a <= b && a <= c) {
            // если a <= b И (одновременно) a <= c, то возвращаем a (оператор
            // return предназначен для возврата результата работы метода)
            return a;
        } else if (b <= a && b <= c) {
            // иначе если b <= a И (одновременно) b <= c, то возвращаем b
            return b;
        } else {
            // иначе возвращаем c
            return c;
        }
    }

    public static void main(String[] args) {
        // выводим на экран результаты вызова метода min с различными параметрами
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
