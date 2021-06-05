package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int currByte;
        int minByte = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        //заполнение HashMap
        while(fileInputStream.available() > 0) {
            currByte = fileInputStream.read();

            if (!map.containsKey(currByte)) {
                map.put(currByte, 1);
            } else {
                map.put(currByte, map.get(currByte) + 1);
            }
        }
        fileInputStream.close();

        //поиск максимального перечисляемого символа

        for(Integer key : map.keySet()) {
            currByte = map.get(key);
            if(currByte < minByte)
                minByte = currByte;
        }

        //вывод максимального символа
        for(Integer key : map.keySet()) {
            if(map.get(key) == minByte)
                System.out.print(key + " ");
        }
    }
}
