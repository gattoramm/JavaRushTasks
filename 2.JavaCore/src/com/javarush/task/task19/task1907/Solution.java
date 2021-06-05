package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            while(reader.ready()) {
                line = reader.readLine();
                Pattern pattern = Pattern.compile("(.*)world(.*)");
                Matcher matcher = pattern.matcher(line);
                while(matcher.find()) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
