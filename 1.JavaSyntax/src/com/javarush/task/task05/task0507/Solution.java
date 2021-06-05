package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int count = 0;
        while (true) {
            int number = Integer.parseInt(bufferedReader.readLine());

            if (number == -1) {
                System.out.println(sum / count);
                return;
            }
            count++;
            sum += number;
        }
    }
}

