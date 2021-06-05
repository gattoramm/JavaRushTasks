package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(5.5, "five and a half");
        labels.put(7.1, "seven point 1");
        labels.put(7.2, "seven point 2");
        labels.put(7.3, "seven point 3");
        labels.put(7.4, "seven point 4");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
