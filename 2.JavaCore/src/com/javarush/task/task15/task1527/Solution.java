package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int input = Integer.parseInt(reader.readLine());
        String st;
        while (!(st = reader.readLine()).equals("?")) {
            try {
            } catch (Exception e) {
                String res = "";
                while (!(st = reader.readLine()).equals("&")) {
                    res += st;
                }
                try {
                    System.out.println(Double.parseDouble(st));
                } catch (NumberFormatException e2) {
                    System.out.println(st);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
