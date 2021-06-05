package com.javarush.task.task14.task1417;

public class Hryvna extends Money {

    Hryvna(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
