package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        String str = byteArrayOutputStream.toString();
        System.setOut(printStream);

        Pattern pattern = Pattern.compile("(\\d+)\\s([-+*])\\s(\\d+)");
        Matcher m = pattern.matcher(str);

        if (m.find()) {
            int result = 0;
            int numFirst = Integer.parseInt(m.group(1) );
            int numSecond = Integer.parseInt(m.group(3));
            switch (m.group(2)){
                case "+": result = numFirst + numSecond; break;
                case "-": result = numFirst - numSecond; break;
                case "*": result = numFirst * numSecond; break;
            }
            System.out.printf("%s %s %s = %d%n", m.group(1), m.group(2), m.group(3), result);
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

