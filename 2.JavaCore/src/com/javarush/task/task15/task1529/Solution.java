package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() throws IllegalArgumentException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String key = reader.readLine();
            if ("plane".equals(key)) {
                key = reader.readLine();
                result = new Plane(Integer.parseInt(key));
            } else if ("helicopter".equals(key)) {
                result = new Helicopter();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
