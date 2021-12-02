package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException {
        if(args.length != 1) return;

        ArrayList<String> fileContent = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            while(bufferedReader.ready())
                fileContent.add(bufferedReader.readLine());
        }

        String regex = "(?<=\\D)\\s(?=[0-9\\s])";
        String[] strings;
        String name;
        int year, month, day;

        String[] dates;

        for(String line : fileContent) {
            strings = line.split(regex);

            name = strings[0];
            dates = strings[0].split(" ");

            year = Integer.parseInt(dates[2]);
            month = Integer.parseInt(dates[1]);
            day = Integer.parseInt(dates[0]);

            Calendar birthDay = new GregorianCalendar(year, month, day);

            PEOPLE.add(new Person(name, birthDay.getTime()));
        }
    }
}
