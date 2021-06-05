package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        // сохранияем текущее значение System.out в отдельную переменную
        // чтобы потом переключиться обратно на вывод в консоль
        PrintStream printStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);

        // Присваиваем System.out новое значение
        System.setOut(stream);
        testString.printSomething();

        // Возвращаем System.out старое значение
        String result = byteArrayOutputStream.toString();
        System.setOut(printStream);
        String[] splitedResult = result.split(System.lineSeparator());
        int count = 0;

        for(String item : splitedResult) {
            System.out.println(item);
            count++;
            if ((count % 2) == 0) {
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
