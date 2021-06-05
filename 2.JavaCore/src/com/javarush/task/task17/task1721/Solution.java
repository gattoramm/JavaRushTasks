package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedReader readFirstFile = new BufferedReader(new FileReader(reader.readLine()))) {
                while(readFirstFile.ready()) {
                    allLines.add(readFirstFile.readLine());
                }
            }

            try (BufferedReader readFirstFile = new BufferedReader(new FileReader(reader.readLine()))) {
                while(readFirstFile.ready()) {
                    forRemoveLines.add(readFirstFile.readLine());
                }

            }
        }

        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {

        if(allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
