package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        if(args.length != 1) return;

        final String strID = args[0] + " ";

        /*
        FileReader rd = new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine());
        BufferedReader rf = new BufferedReader(rd);
        rf.lines().filter(s -> s.startsWith(strID)).forEach(s -> System.out.println(s));
        */

        try(FileReader reader =
                    new FileReader(
                        new BufferedReader(
                            new InputStreamReader(System.in)).readLine());
            BufferedReader readerFile = new BufferedReader(reader))
        {
            String line;
            while( (line = readerFile.readLine()) != null )
                if(line.startsWith(strID))
                    System.out.println(line);
        }
    }
}
