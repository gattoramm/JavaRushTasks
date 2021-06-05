package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream fst = new FileInputStream(file);

        int maxByte = 0;

        int[] bytes = new int[256];

        while(fst.available() > 0) {
            bytes[fst.read() & 0b11111111]++;
        }
        fst.close();

        //поиск максимального количества повторов
        for(int i = 0; i < 256; i++)
            if(bytes[i] > maxByte)
                maxByte = bytes[i];
        //вывод байтов с максимальным количеством повторов
        for(int i=0; i<256; i++)
            if(bytes[i] == maxByte)
                System.out.println(i);

    }
}
