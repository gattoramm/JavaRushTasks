package com.javarush.task.task02.task0205;

public class Solution {
    public static void main(String[] args) {
        // вызов метода hackSalary со значением аргумента 700
        hackSalary(700);
    }

    // метод public static void hackSalary с аргументом int salary
    public static void hackSalary(int salary) {
        // переменной salary присваивается старое значение, увеличенное на 100
        salary = salary + 100;
        // складываем (конкатенируем) из строк фразу и выводим ее на экран (при
        // сложении строки с числом, число преобразуется в строку)
        System.out.println("Твоя зарплата составляет: " + salary + " долларов в месяц.");
    }
}