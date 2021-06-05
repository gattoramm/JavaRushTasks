package com.javarush.task.task03.task0312;

public class Solution {
    public static int convertToSeconds(int hour) {
        return hour * 60 * 60;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(10));
        System.out.println(convertToSeconds(12));
    }
}
