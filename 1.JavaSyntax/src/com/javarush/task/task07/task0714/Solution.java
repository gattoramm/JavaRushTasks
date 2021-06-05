package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String string = reader.readLine();
            list.add(string);
        }

        list.remove(2);

        for (int i = list.size() - 1; i >= 0; i--) {
            String string = list.get(i);
            System.out.println(string);
        }
    }
}
