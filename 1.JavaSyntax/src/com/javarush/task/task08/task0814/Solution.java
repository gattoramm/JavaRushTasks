package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(16);
        set.add(26);
        set.add(36);
        set.add(46);
        set.add(56);
        set.add(66);
        set.add(76);
        set.add(86);
        set.add(10);
        set.add(6);

        set.add(17);
        set.add(27);
        set.add(37);
        set.add(47);
        set.add(57);
        set.add(67);
        set.add(77);
        set.add(87);
        set.add(97);
        set.add(7);

        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>(set);
        for (Integer number : copy) {
            if (number > 10) {
                set.remove(number);
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
