package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int number = Integer.parseInt(reader.readLine());

        while (number > 0) {
            System.out.println(string);
            number--;
        }
    }
}
