package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileReader;

        Set<String> set = new TreeSet<>(String::compareTo);

        while( !( fileReader = bufferedReader.readLine() ).endsWith("end") )
            set.add(fileReader);

        String nameFileWrite = set.iterator().next();

        String fileWriter = nameFileWrite.substring(0, nameFileWrite.indexOf(".part"));

        try(BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(fileWriter)))
        {
            for (String ts : set) {
                try(FileInputStream fileInputStream = new FileInputStream(ts))
                {
                    while( (fileInputStream.available()) > 0 ) {
                        byte[] buffer = new byte[fileInputStream.available()];
                        int count = fileInputStream.read(buffer);
                        output.write(buffer,0, count);
                    }
                }
            }
        }
    }
}
