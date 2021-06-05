package com.javarush.task.task09.task0919;

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        int x = 5 / 0;
        System.out.println(x);
    }
}
