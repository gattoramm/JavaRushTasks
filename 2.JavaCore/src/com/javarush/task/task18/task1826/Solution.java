package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {
        if(args.length  != 3)
            return;

        String flag = args[0];

        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(args[1]));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(args[2])))
        {
            int i;
            if(flag.equals("-d") || flag.equals("-e")) {
                do {
                    i = input.read();
                    if(i != -1)
                        output.write(i ^ 0b0101);
                } while(i != -1);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
