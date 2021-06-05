package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String result = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = (i == 0 || chars[i - 1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
            result += character;
        }
        System.out.println(result);
    }
}
