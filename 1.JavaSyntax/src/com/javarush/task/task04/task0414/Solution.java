package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());

        int days;

        if (year % 400 == 0) {
            days = 366;
        } else if (year % 100 == 0) {
            days = 365;
        } else if (year % 4 == 0) {
            days = 366;
        } else {
            days = 365;
        }

        System.out.println("количество дней в году: " + days);
    }
}
