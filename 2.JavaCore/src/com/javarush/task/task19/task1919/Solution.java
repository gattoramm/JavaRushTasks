package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        TreeMap<String, Double> map = new TreeMap<>();
        String fileName = args[0];

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String[] splited;
            String name;
            Double value;
            while(bufferedReader.ready()) {
                splited = bufferedReader.readLine().split(" ");
                name = splited[0];
                value = Double.parseDouble(splited[1]);

                if (!map.containsKey(name))
                    map.put(name, value);
                else
                    map.put(name, map.get(name) + value);
            }

            for (String i : map.keySet()) {
                System.out.println(i + " " + map.get(i));
            }
        }
    }
}
