package org.example.setHashMap;

import java.util.HashSet;
import java.util.Set;

public class TworzyDwaSetyLaczyJeUsuwaJedenSet {

    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Pies> psy = utworzPsy();

        Set<Object> zwierzeta = dolacz(koty, psy);
        printZwierzeta(zwierzeta);

        usunKoty(zwierzeta, koty);
        printZwierzeta(zwierzeta);
    }

    public static Set<Kot> utworzKoty() {

        HashSet<Kot> wynik = new HashSet<Kot>();

        wynik.add(new Kot());
        wynik.add(new Kot());
        wynik.add(new Kot());
        wynik.add(new Kot());

        return wynik;
    }

    public static Set<Pies> utworzPsy() {

        HashSet<Pies> dogs = new HashSet<Pies>();

        dogs.add(new Pies());
        dogs.add(new Pies());
        dogs.add(new Pies());

        return dogs;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {

        HashSet together = new HashSet<>();
        together.addAll(koty);
        together.addAll(psy);

        return together;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {
        zwierzeta.removeAll(koty);
    }

    public static void printZwierzeta(Set<Object> zwierzeta) {
        for (Object lista : zwierzeta) {
            System.out.println(lista);
        }
    }

    public static class Kot {

    }

    public static class Pies {

    }
}
