package com.javarush.task.task03.task0307;

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.name = "Zerg1";
        zerg2.name = "Zerg2";
        zerg3.name = "Zerg3";
        zerg4.name = "Zerg4";
        zerg5.name = "Zerg5";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        protoss1.name = "Protoss1";
        protoss2.name = "Protoss2";
        protoss3.name = "Protoss3";

        Terran terran01 = new Terran();
        Terran terran02 = new Terran();
        Terran terran03 = new Terran();
        Terran terran04 = new Terran();

        terran01.name = "Terran1";
        terran02.name = "Terran2";
        terran03.name = "Terran3";
        terran04.name = "Terran4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
