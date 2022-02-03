package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    static final int count = 5;
    public static volatile List<Thread> list = new ArrayList<>(count);

    public static void main(String[] args) {
        for (int i = 0; i < count; i++) {
            list.add(new Thread(new SpecialThread()));
        }
        for (Thread item: list) {
            item.start();
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
