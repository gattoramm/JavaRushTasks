package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        if(args.length != 1) return;

        try(FileReader in = new FileReader(args[0]))
        {
            int i;
            int count = 0, countOfSpaces = 0;
            while((i = in.read()) != -1) {
                if(i!=13 && i!=10) {
                    count++;
                    if (32 == i)
                        countOfSpaces++;
                }
            }
            try {
                double result = 100*(double)(countOfSpaces) / (double)(count) ;
                System.out.printf("%.2f%n",result);
            } catch(ArithmeticException e) {
                System.out.println("Divide by zero");
            }

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
