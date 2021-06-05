package com.javarush.task.task12.task1227;

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public class Duck implements CanSwim, CanRun, CanFly {
        public void fly() {
        }

        public void swim() {
        }

        public void run() {
        }
    }

    public class Penguin implements CanSwim, CanRun {
        public void swim() {
        }

        public void run() {
        }
    }

    public class Toad implements CanSwim {
        public void swim() {
        }
    }
}
