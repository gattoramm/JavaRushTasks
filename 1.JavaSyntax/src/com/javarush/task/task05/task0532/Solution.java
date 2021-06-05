package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        if (number <= 0) {
            return;
        }

        int[] data = new int[number];
        for (int i = 0; i < number; i++) {
            data[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = data[0];
        for (int i = 1; i < number; i++) {
            if (data[i] > maximum) {
                maximum = data[i];
            }
        }

        System.out.println(maximum);
    }

}
