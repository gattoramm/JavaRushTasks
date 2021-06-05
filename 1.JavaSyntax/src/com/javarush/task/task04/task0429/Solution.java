package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int countPositive = 0;
        int countNegative = 0;
        if (number1 > 0) {
            countPositive++;
        } else if (number1 < 0) {
            countNegative++;
        }
        if (number2 > 0) {
            countPositive++;
        } else if (number2 < 0) {
            countNegative++;
        }
        if (number3 > 0) {
            countPositive++;
        } else if (number3 < 0) {
            countNegative++;
        }
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
