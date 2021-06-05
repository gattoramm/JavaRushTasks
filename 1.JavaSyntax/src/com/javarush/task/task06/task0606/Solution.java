package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        while (count > 0) {
            if (count % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            count = count / 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
