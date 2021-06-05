package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileAdress = reader.readLine();
        
        FileInputStream fst = null;
        fst = new FileInputStream(fileAdress);
        
        int maxBite = 0;
        int currBite;
        
        while(fst.available()>0) {
            currBite=fst.read();
            if(currBite > maxBite) {
                maxBite = currBite;
            }
        }
        
        fst.close();
        System.out.println(maxBite);
    }
}
