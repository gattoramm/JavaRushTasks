package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] argss) throws IOException {
        //String[] args = {"-d", "198479"};
        String[] args = {"-u", "198479", "productName", "56.34", "34"};
        if(args.length == 0) return;

        if(args[0].equals("-u") || args[0].equals("-d")) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

                String fileName = reader.readLine();
                List<String> products = new ArrayList<>();
                //чтение с файла в List
                try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader( fileName ))) {
                    while (bufferedFileReader.ready()) {
                        String strLine = bufferedFileReader.readLine();

                        if(strLine.substring(0, 8).trim().equals(args[1])) {
                            if(args[0].equals("-u")) {
                                products.add(String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]));
                            }
                            if(args[0].equals("-d")) continue;
                        } else products.add(strLine);
                    }
                }

                //запись измененного List в файл
                try (FileWriter fileWriter = new FileWriter(fileName,false)) {
                    for(String str : products) {
                        fileWriter.write(str+"\r\n");
                    }
                }
            }
        }
    }
}
