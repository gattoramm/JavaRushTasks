package com.javarush.task.task15.task1530;

public class Solution {
    public static void main(String[] args) {
        DrinkMaker latteMaker = new LatteMaker();
        DrinkMaker teaMaker = new TeaMaker();

        latteMaker.makeDrink();
        teaMaker.makeDrink();
    }
}
