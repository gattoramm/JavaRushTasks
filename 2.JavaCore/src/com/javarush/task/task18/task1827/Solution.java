package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try(FileReader fileReader =
                    new FileReader(
                            new BufferedReader(
                                    new InputStreamReader(System.in)).readLine());
        BufferedReader readerFile = new BufferedReader(fileReader))
        {
            //try()
            if(args[0].equals("-c")) {
                String last = "", line;

                String productName = String.format("%-30s", args[1]);
                String price = String.format("%-8s", args[2]);
                String quantity = String.format("%-4s", args[3]);

                while ((line = readerFile.readLine()) != null)
                    last = line;

                Integer endId = Integer.parseInt(last.substring(0, 7).replace(" ", ""));
                String id = String.format("%-8s", endId++);
            }
        }

    }
}
