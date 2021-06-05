package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            String command = reader.readLine();
            if (command.equals("сумма")) {
                System.out.println(sum);
                return;
            }
            int number = Integer.parseInt(command);
            sum += number;
        }
    }
}
