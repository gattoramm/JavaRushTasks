package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName1;
        String fileName2;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();

            ArrayList<String> list = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
                while (reader.ready()) {
                    list.add(reader.readLine().replaceAll("\\p{Punct}", ""));
                }
            }

            try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
                for(String item:list) {
                    writer.write(item);
                }
            }
        }
    }
}
