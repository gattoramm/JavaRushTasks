package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        if(args.length != 1) return;

        try(FileReader reader = new FileReader(args[0])) {
            int curByte;
            int count = 0;
            String curChr;
            while((curByte = reader.read()) != -1) {
                curChr = String.valueOf((char)curByte);
                if (curChr.matches("[a-zA-Z]"))
                    count++;
            }
            System.out.println(count);
        }
    }
}
