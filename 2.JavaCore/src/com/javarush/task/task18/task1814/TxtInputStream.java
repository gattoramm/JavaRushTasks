package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public static String Str1 = ".txt";

    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);
        if(!fileName.endsWith(Str1)) {
            super.close();
            throw new UnsupportedFileNameException();
        }

        new FileInputStream(fileName);

    }

    public static void main(String[] args) {
    }
}

