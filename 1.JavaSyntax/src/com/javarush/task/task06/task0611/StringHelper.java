package com.javarush.task.task06.task0611;

public class StringHelper {
    public static String multiply(String text) {
        return multiply(text, 5);
    }

    public static String multiply(String text, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(text);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

    }
}
