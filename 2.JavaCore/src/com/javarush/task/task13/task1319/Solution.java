package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String destinationFileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));

        StringBuilder builder = new StringBuilder();

        String s = "";
        while (!s.equals("exit")) {
            s = reader.readLine();
            builder.append(s).append("\n");
        }

        writer.write(builder.toString());
        writer.close();
    }
}
