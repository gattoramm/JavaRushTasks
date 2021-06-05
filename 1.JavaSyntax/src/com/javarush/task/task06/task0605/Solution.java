package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double index = weight / (height * height);
            if (index < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (index >= 18.5 && index < 25) {
                System.out.println("Нормальный: между 18.5 и 25");
            } else if (index >= 25 && index < 30) {
                System.out.println("Избыточный вес: между 25 и 30");
            } else if (index >= 30) {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
