package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileAdress = reader.readLine();
        
        FileInputStream fst = new FileInputStream(fileAdress);
        
        int minByte = Integer.MAX_VALUE;
        int currByte;
        
        while(fst.available() > 0) {
            currByte = fst.read();
            if(currByte < minByte)
                minByte = currByte;
        }
        
        fst.close();
        System.out.println(minByte);
    }
}
