package com.javarush.task.task19.task1926;

import java.io.*;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = bufferedReader.readLine();
        }

        PrintStream consoleStream = System.out;

        try(FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader)) {

            while(reader.ready()) {
                System.setOut(consoleStream);
                String line = reader.readLine();
                System.out.println(new StringBuilder(line).reverse());
            }
        }
    }
}
