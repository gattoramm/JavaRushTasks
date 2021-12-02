package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        String fileName1, fileName2;

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
        }

        List<String> listFile1 = new ArrayList<>();
        List<String> listFile2 = new ArrayList<>();

        try(BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1));
            BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2))) {

            // по каждому файлу сформируем ключ - номер строки, значение - содержимое строки
            while(fileReader1.ready()) {
                listFile1.add(fileReader1.readLine());
            }

            while(fileReader2.ready()) {
                listFile2.add(fileReader2.readLine());
            }

            //процесс сравнения
            if(!listFile1.isEmpty() && !listFile2.isEmpty()) {
                for(int i=0; i<listFile1.size()-1; i++) {
                    for(int j=0; j<listFile2.size()-1; j++) {
                        if(listFile1.get(i) == listFile2.get(j)) {
                            lines.add(new LineItem(Type.SAME, listFile1.get(i)));
                        }
                        else {

                        }
                    }
                }
            }
            //for (Map.Entry<String, Integer> pair: items.entrySet()) {

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
