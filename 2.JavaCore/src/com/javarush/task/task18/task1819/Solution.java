package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String output = reader.readLine();

        FileInputStream inputIn = new FileInputStream(input);

        byte[] bufferFirstFile = new byte[0];
        byte[] bufferSecondFile;

        int countOutputIn;
        if(inputIn.available() > 0) {
            bufferFirstFile = new byte[inputIn.available()];
            int countInputIn = inputIn.read(bufferFirstFile);
        }

        FileOutputStream inputOut = new FileOutputStream(input);
        FileInputStream outputIn = new FileInputStream(output);

        if(outputIn.available() > 0) {
            bufferSecondFile = new byte[outputIn.available()];
            countOutputIn = outputIn.read(bufferSecondFile);
            inputOut.write(bufferSecondFile);
        }
        inputOut.write(bufferFirstFile);

        inputIn.close();
        inputOut.close();
        outputIn.close();
    }
}
