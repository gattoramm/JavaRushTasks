package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException{
        String fileName;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            fileName = bufferedReader.readLine();
        }

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String[] sepLine;
            while(fileReader.ready()) {
                String line = fileReader.readLine();
                sepLine = line.split(" ");
                int count = 0;
                for(String itemMassive : sepLine)
                    if(words.contains(itemMassive))
                        count++;
                if(count == 2) {
                    System.out.println(line);
                }
            }
        }
    }
}
