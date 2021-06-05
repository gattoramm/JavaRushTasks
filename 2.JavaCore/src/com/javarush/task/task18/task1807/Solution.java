package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());

        int ascii = (int) ',';
        int counter = 0;

        while(file.available() > 0) {
            if(file.read() == ascii) {
                counter++;
            }
        }

        file.close();
        System.out.println(counter);
    }
}
