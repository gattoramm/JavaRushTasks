package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try(FileOutputStream output = new FileOutputStream(reader.readLine());
            FileInputStream inputOne = new FileInputStream(reader.readLine());
            FileInputStream inputTwo = new FileInputStream(reader.readLine()))
        {

            while (inputOne.available() > 0) {
                int count = inputOne.read();
                output.write(count);
            }

            while (inputTwo.available() > 0) {
                int count = inputTwo.read();
                output.write(count);
            }
        }
    }
}
