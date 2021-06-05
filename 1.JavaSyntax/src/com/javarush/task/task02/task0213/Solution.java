package com.javarush.task.task02.task0213;

public class Solution {
    public static void main(String[] args) {
        // создаем переменную cat типа Cat (Cat cat) и объект Cat (new Cat())
        // и присваиваем переменной ссылку на объект
        Cat cat = new Cat();
        // создаем переменную dog типа Dog (Dog dog) и объект Dog (new Dog())
        // и присваиваем переменной ссылку на объект
        Dog dog = new Dog();
        // создаем переменную fish типа Fish (Fish fish) и объект Fish (new Fish())
        // и присваиваем переменной ссылку на объект
        Fish fish = new Fish();
        // создаем переменную woman типа Woman (Woman woman) и объект Woman
        // (new Woman()) и присваиваем переменной ссылку на объект
        Woman woman = new Woman();

        // присваиваем каждому животному владельца (owner)
        // в cat.owner сохраняем ссылку на ранее созданный объект Woman
        cat.owner = woman;
        // в dog.owner сохраняем ссылку на ранее созданный объект Woman
        dog.owner = woman;
        // в fish.owner сохраняем ссылку на ранее созданный объект Woman
        fish.owner = woman;
    }

    // класс Cat
    public static class Cat {
        // объявляем переменную owner типа Woman
        public Woman owner;
    }

    // класс Dog
    public static class Dog {
        // объявляем переменную owner типа Woman
        public Woman owner;
    }

    // класс Fish
    public static class Fish {
        // объявляем переменную owner типа Woman
        public Woman owner;
    }

    // класс Woman
    public static class Woman {
    }
}
