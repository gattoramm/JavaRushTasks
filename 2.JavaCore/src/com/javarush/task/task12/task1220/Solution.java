package com.javarush.task.task12.task1220;


public class Solution {
    public static void main(String[] args) {

    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public abstract class Human implements CanRun, CanSwim {

    }
}
