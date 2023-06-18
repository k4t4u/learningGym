package org.example.arrayListIList;

import java.util.HashSet;

public class UsuwaElementyWiekszeNiz {

    public static HashSet<Integer> utworzSet() {
        HashSet<Integer> set = new HashSet<>();

        set.add(13);
        set.add(16);
        set.add(11);
        set.add(12);
        set.add(22);
        set.add(33);
        set.add(23);
        set.add(1);
        set.add(32);
        set.add(14);

        set.add(452);
        set.add(42);
        set.add(534);
        set.add(423);
        set.add(123);
        set.add(432);
        set.add(43);
        set.add(4321);
        set.add(434);
        set.add(532);

        return set;
    }
    public static HashSet<Integer> usunLiczbyWiekszeNiz10(HashSet<Integer> set) {
        HashSet<Integer> copy = new HashSet<>(set);
        for (Integer n : copy) {
            if (n > 10) {
                set.remove(n);
            }
        }
        return set;

    }
    public static void main(String[] args) {
    }
}
