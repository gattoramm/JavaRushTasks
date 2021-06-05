package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        String minSizeElement = strings.get(0);
        int posMinElement = 0;
        String maxSizeElement = strings.get(0);
        int posMaxElement = 0;
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() < minSizeElement.length()) {
                minSizeElement = strings.get(i);
                posMinElement = i;
            } else if (strings.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = strings.get(i);
                posMaxElement = i;
            }
        }

        if (posMinElement < posMaxElement) {
            System.out.println(minSizeElement);
        } else {
            System.out.println(maxSizeElement);
        }
    }
}
