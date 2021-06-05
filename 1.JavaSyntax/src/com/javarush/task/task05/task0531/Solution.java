package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        int fourthNumber = Integer.parseInt(reader.readLine());
        int fifthNumber = Integer.parseInt(reader.readLine());

        int minimum = min(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        return min(min(firstNumber, secondNumber), min(min(thirdNumber, fourthNumber), fifthNumber));
    }

    public static int min(int firstNumber, int secondNumber) {
        return firstNumber < secondNumber ? firstNumber : secondNumber;
    }

}
