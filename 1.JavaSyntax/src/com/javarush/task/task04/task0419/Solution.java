package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int number4 = Integer.parseInt(reader.readLine());

        int max1 = number1 > number2 ? number1 : number2;
        int max2 = number3 > number4 ? number3 : number4;
        int max = max1 > max2 ? max1 : max2;
        System.out.println(max);
    }
}
