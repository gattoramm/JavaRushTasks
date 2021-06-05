package com.javarush.task.task10.task1015;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] result = new ArrayList[3];

        result[0] = new ArrayList<>();
        result[1] = new ArrayList<>();
        result[2] = new ArrayList<>();

        result[0].add("Mama");
        result[1].add("Mila");
        result[2].add("Ramu");

        return result;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
