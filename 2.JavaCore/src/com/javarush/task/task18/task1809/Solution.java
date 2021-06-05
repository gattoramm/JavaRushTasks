package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream filein = new FileInputStream(reader.readLine());
        FileOutputStream fileout = new FileOutputStream(reader.readLine());

        List<Integer> list = new ArrayList<Integer>();

        while(filein.available() > 0) {
            list.add(filein.read());
        }

        for(int i = list.size() - 1; i >= 0; i--) {
            fileout.write(list.get(i));
        }

        filein.close();
        fileout.close();
    }
}
