package com.javarush.task.task16.task1619;

public class Solution {
    public static volatile boolean finish = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        finish = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!finish) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
