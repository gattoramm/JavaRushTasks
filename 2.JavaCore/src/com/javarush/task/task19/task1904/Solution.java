package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Person person ;
            String[] words = fileScanner.nextLine().split(" ",4);//Иванов Иван Иванович 31 12 1950
            person = new Person(words[1], words[2], words[0], formatter.parse(words[3]));
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
