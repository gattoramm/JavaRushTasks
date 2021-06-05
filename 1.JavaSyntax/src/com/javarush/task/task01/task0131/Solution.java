package com.javarush.task.task01.task0131;

public class Solution {
    public static void main(String[] args) {
        // выводим на экран значение - результат вызова метода
        // getMetreFromCentimetre со значением аргумента 243
        System.out.println(getMetreFromCentimetre(243));
    }

    // метод getMetreFromCentimetre принимает в качестве аргумента centimetre
    // значение длины в сантиметрах, переводит в метры и возвращает это значение
    // в качестве результата
    public static int getMetreFromCentimetre(int centimetre) {
        // объявляем переменную metre типа int и присваиваем ей значение -
        // результат вычисления выражения centimetre / 100
        int metre = centimetre / 100;
        // возращаем значение переменной metre как результат работы метода
        return metre;
    }
}