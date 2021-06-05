package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName1;
        String fileName2;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
            ArrayList<String> list = new ArrayList<>();

            try(BufferedReader readFile = new BufferedReader(new FileReader(fileName1))) {
                while(readFile.ready()) {
                    String[] parseLine = readFile.readLine().split(" ");
                    for(String item:parseLine) {
                        list.add(item);
                    }
                }
            }

            try(BufferedWriter writeFile = new BufferedWriter(new FileWriter(fileName2))) {
                Pattern pattern = Pattern.compile("\\b\\d+\\b");
                Matcher matcher;
                for(String item:list) {
                    matcher = pattern.matcher(item);
                    if(matcher.find()) {
                        writeFile.write(item + " ");
                    }
                }
            }
        }
    }
}
