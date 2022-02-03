package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        // выводим на экран значение - результат вызова метода getWeight со
        // значением аргумента 888
        System.out.println(getWeight(888));
    }

    // метод getWeight принимает в качестве аргумента earthWeight вес тела
    // (в Ньютонах) на Земле, переводит в значение веса тела (в Ньютонах)
    // на Луне и возвращает это значение в качестве результата
    public static double getWeight(int earthWeight) {
        // объявляем переменную moonWeight типа double и присваиваем ей
        // значение - результат вычисления выражения 0.17 * earthWeight
        double moonWeight = 0.17 * earthWeight;
        // возращаем значение переменной moonWeight как результат работы метода
        return moonWeight;
    }
}
