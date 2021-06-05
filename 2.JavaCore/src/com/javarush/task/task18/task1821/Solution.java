package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        try(FileInputStream reader = new FileInputStream(args[0]))
        {
            int[] readByte = new int[128];

            while(reader.available() > 0)
                readByte[reader.read()]++;

            for (int i = 0; i < readByte.length; i++) {
                if (readByte[i] > 0) {
                    System.out.println((char) i + " " + readByte[i]);
                }
            }
        }
    }
}
