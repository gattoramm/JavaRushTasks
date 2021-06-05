package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 9;
    }
}
