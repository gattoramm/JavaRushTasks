package com.javarush.task.task10.task1003;


public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) ((byte) i + f);
        System.out.println(b);
    }
}
