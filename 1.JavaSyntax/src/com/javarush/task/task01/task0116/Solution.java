package com.javarush.task.task01.task0116;

public class Solution {
    public static void main(String[] args) {
        // изменяем значение переменной name было Ellie, стало Amigo
        String name = "Amigo";
        // конкатенируем (соединяем) строки, значение переменной text будет
        // "Hello, Amigo!"
        String text = "Hello, " + name + "!";
        // выводим на экран переменную text (ее значение)
        System.out.println(text);
    }
}
