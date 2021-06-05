package com.javarush.task.task14.task1408;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;

            switch (country) {
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    break;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
            }
            return hen;
        }
    }
}
