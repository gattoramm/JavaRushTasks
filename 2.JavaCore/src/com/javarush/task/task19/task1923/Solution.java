package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        if(args.length == 0) return;

        try(BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]))) {
            while(fileReader.ready()) {
                String[] splitLine = fileReader.readLine().split(" ");
                for(String item : splitLine)
                    if(Pattern.compile("\\d+").matcher(item).find())
                        fileWriter.write(item + " ");
            }
        }
    }
}
