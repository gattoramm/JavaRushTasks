package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //if(args.length == 0) return;

        String[] tag = {"span"};
        String fileName = "D:\\1.txt";

        final String tagStart = "<" + tag[0];
        final String tagStop = "/" + tag[0] + ">";

        /*try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = bufferedReader.readLine();
        }*/

        StringBuilder stringBuilder;

        try(BufferedReader readFile = new BufferedReader(new FileReader(fileName))) {
            stringBuilder = new StringBuilder();
            while(readFile.ready()) {
                stringBuilder.append((char)(readFile.read()));
            }
        }

        String fileContentOnLine = stringBuilder.toString().replace("\r\n","");

        String parseLine = fileContentOnLine.
                substring(
                    fileContentOnLine.indexOf(tagStart),
                    fileContentOnLine.lastIndexOf(tagStop) + tagStop.length());

        System.out.println(parseLine);
        System.out.println();
        //А.+?а
        Pattern pattern = Pattern.compile("<span.+?/span>");
        Matcher matcher = pattern.matcher(parseLine);
        while (matcher.find()) {
            System.out.println(parseLine.substring(matcher.start(), matcher.end()));
        }

    }
}
