package com.javarush.task.task14.task1409;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge waterBridge) {
        System.out.println(waterBridge.getCarsCount());
    }
}
