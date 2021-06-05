package com.javarush.task.task13.task1315;

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface Eat {
        void eat();
    }

    class Cat implements Movable, Edible, Eat {

        public void eat() {

        }

        public void beEaten() {

        }

        public void move() {

        }
    }

    class Mouse implements Movable, Edible {

        public void beEaten() {

        }

        public void move() {

        }
    }

    class Dog implements Movable, Eat {

        public void eat() {

        }

        public void move() {

        }
    }
}
