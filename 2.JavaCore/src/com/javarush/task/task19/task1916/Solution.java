package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException{
        String fileName1, fileName2;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
        }

        HashMap<Integer, String> mapFile1 = new HashMap<>();
        HashMap<Integer, String> mapFile2 = new HashMap<>();

        try(BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1));
            BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2))) {
            int count = 0;

            while(fileReader1.ready()) {
                mapFile1.put(count++, fileReader1.readLine());
            }

            count = 0;
            while(fileReader2.ready()) {
                mapFile2.put(count++, fileReader2.readLine());
            }

        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
