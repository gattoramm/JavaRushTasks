package com.javarush.task.task07.task0707;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list.size());
        for (String string : list) {
            System.out.println(string);
        }
    }
}
