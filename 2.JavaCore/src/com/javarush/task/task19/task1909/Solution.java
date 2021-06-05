package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            ArrayList<Character> list = new ArrayList<>();
            try (BufferedReader readFile = new BufferedReader(new FileReader(reader.readLine()));
                 BufferedWriter writeFile = new BufferedWriter(new FileWriter(reader.readLine()))) {
                Character item;
                while(readFile.ready()) {
                    item = (char)readFile.read();
                    if(!item.equals('.')) {
                        list.add(item);
                    } else {
                        list.add('!');
                    }
                }
                for(Character i:list) {
                    writeFile.write(i);
                }
            }
        }
    }
}
