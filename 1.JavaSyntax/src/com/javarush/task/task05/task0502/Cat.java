package com.javarush.task.task05.task0502;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0;
    }

    public static void main(String[] args) {

    }
}
