package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readFile;
        while( !(readFile = bufferedReader.readLine()).endsWith("exit") ) {
            ReadThread readThread = new ReadThread(readFile);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread{
        private final String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try(FileInputStream fileInputStream = new FileInputStream(fileName))
            {
                long maxRepeat = 0;
                int[] bytesCount = new int[256];
                
                while(fileInputStream.available() > 0) {
                    bytesCount[fileInputStream.read()]++;
                }

                for(int currByte : bytesCount)
                    maxRepeat = (currByte > maxRepeat) ? currByte : maxRepeat;

                for(int i=0; i<bytesCount.length; i++)
                    if(bytesCount[i] == maxRepeat)
                        resultMap.put(fileName,i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
