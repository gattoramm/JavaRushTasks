package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());

        Set<Integer> bytes = new TreeSet<>();
        int currentByte;

        while(fileInputStream.available() > 0) {
            currentByte = fileInputStream.read();
            bytes.add(currentByte);
        }
        fileInputStream.close();
        
        Iterator<Integer> itr = bytes.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

}
