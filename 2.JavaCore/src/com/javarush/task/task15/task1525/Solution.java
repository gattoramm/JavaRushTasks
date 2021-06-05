package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        String line;
        try {
            FileReader fr = new FileReader(Statics.FILE_NAME);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException fN) {
            fN.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
