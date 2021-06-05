package com.javarush.task.task02.task0209;

public class Solution {
    public static void main(String[] args) {
        // создаем переменную dog1 типа Dog (Dog dog1) и объект Dog (new Dog())
        // и присваиваем переменной ссылку на объект
        Dog dog1 = new Dog();
        // присваиваем имя собаке: в переменную name данной объекта dog1 вносим
        // значение "Max"
        dog1.name = "Max";

        // создаем переменную dog2 типа Dog (Dog dog2) и объект Dog (new Dog())
        // и присваиваем переменной ссылку на объект
        Dog dog2 = new Dog();
        // присваиваем имя собаке: в переменную name данной объекта dog2 вносим
        // значение "Bella"
        dog2.name = "Bella";

        // создаем переменную dog3 типа Dog (Dog dog3) и объект Dog (new Dog())
        // и присваиваем переменной ссылку на объект
        Dog dog3 = new Dog();
        // присваиваем имя собаке: в переменную name данной объекта dog3 вносим
        // значение "Jack"
        dog3.name = "Jack";
    }

    // class Dog
    public static class Dog {
        // объявляем переменную name типа String
        public String name;
    }
}
