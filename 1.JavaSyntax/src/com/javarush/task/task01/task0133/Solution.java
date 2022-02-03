package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        // объявляем переменную secondsAfter15 типа int и сразу же в строке
        // объявления присваиваем ей значение 30 * 60, так с 15:00 до 15:30
        // прошло 30 минут, а в одной минуте 60 секунд
        int secondsAfter15 = 30 * 60;
        // выводим на экран значение переменной secondsAfter15
        System.out.println(secondsAfter15);
    }
}