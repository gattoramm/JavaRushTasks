package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        List<Integer> data = new ArrayList<Integer>();

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) data.add(value);
        }

        Collections.sort(data);

        for (Integer value : data)
            System.out.println(value);

        scanner.close();
        fileInputStream.close();
    }
}
