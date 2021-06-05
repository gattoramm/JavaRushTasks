package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //if(args.length == 0) return;

        try(BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            FileWriter fileWriter = new FileWriter(args[1])) {

            String[] splitedLine;
            ArrayList<String> list = new ArrayList<>();
            while(fileReader.ready()) {
                splitedLine = fileReader.readLine().split(" ");
                for(String item : splitedLine)
                    if(item.length() > 6)
                        list.add(item);
            }
            fileWriter.write(String.join(",", list));
        }
    }
}
