package com.javarush.task.task18.task1820;

import java.io.*;

import static java.lang.Math.round;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try(FileInputStream inputStream = new FileInputStream(bufferedReader.readLine());
            FileOutputStream outputStream = new FileOutputStream(bufferedReader.readLine()))
        {
            int readBite;

            while((readBite = inputStream.read()) != -1) {

                StringBuilder biteToStr = new StringBuilder();

                do {

                    biteToStr.append((char) readBite);
                    readBite = inputStream.read();

                } while ((readBite != (int) ' ') && readBite != -1);

                int roundReadInput = (int) round(Double.parseDouble(biteToStr.toString()));
                outputStream.write(Integer.toString(roundReadInput).getBytes());
                outputStream.write(' ');
            }
        }
    }
}
