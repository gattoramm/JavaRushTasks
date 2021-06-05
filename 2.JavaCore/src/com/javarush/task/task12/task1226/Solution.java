package com.javarush.task.task12.task1226;


public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

    public class Cat implements CanRun, CanClimb {
        public void climb() {
        }

        public void run() {
        }
    }

    public class Dog implements CanRun {
        public void run() {

        }
    }

    public class Tiger extends Cat {
        public void run() {
        }

        public void climb() {
        }
    }

    public class Duck implements CanRun, CanFly {
        public void run() {
        }

        public void fly() {
        }
    }
}
