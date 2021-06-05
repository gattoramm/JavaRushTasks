package com.javarush.task.task04.task0433;

public class Solution {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            int j = 0;
            while (j < 10) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
