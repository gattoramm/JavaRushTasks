package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int maxStringLength = strings.get(0).length();
        for (String string : strings) {
            if (string.length() > maxStringLength) {
                maxStringLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == maxStringLength) {
                System.out.println(string);
            }
        }
    }
}
