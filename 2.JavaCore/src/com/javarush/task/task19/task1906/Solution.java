package com.javarush.task.task19.task1906;

import java.io.*;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            try(FileReader fileReader = new FileReader(bufferedReader.readLine());
                FileWriter fileWriter = new FileWriter(bufferedReader.readLine())) {
                int byteReader;
                int count = 0;
                while( (byteReader = fileReader.read()) != -1) {
                    if(1 == count%2) {
                        fileWriter.write(byteReader);
                    }
                    count++;
                }
            }
        }
    }
}
