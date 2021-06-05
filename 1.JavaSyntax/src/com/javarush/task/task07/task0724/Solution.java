package com.javarush.task.task07.task0724;

public class Solution {
    public static void main(String[] args) {
        Human paternalGrandfather = new Human("Петр", true, 61);
        Human paternalGrandmother = new Human("Мария", false, 60);

        Human maternalGrandfather = new Human("Александр", true, 63);
        Human maternalGrandmother = new Human("Ольга", false, 62);


        Human father = new Human("Андрей", true, 35, paternalGrandfather, paternalGrandmother);
        Human mother = new Human("Елена", false, 30, maternalGrandfather, maternalGrandmother);

        Human firstChild = new Human("Игорь", true, 15, father, mother);
        Human secondChild = new Human("Сергей", false, 10, father, mother);
        Human thirdChild = new Human("Виктор", true, 5, father, mother);

        System.out.println(paternalGrandfather);
        System.out.println(paternalGrandmother);
        System.out.println(maternalGrandfather);
        System.out.println(maternalGrandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
