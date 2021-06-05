package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.ArrayList;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream filein = new FileInputStream(reader.readLine());
        FileOutputStream fileout1 = new FileOutputStream(reader.readLine());
        FileOutputStream fileout2 = new FileOutputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        while(filein.available() > 0) {
            list.add(filein.read());
        }
        filein.close();

        for(int i = 0; i < (list.size() + 1)/2; i++)
            fileout1.write(list.get(i));

        for(int i = (list.size() + 1) / 2; i <= list.size() - 1; i++)
            fileout2.write(list.get(i));

        fileout1.close();
        fileout2.close();
    }
}
