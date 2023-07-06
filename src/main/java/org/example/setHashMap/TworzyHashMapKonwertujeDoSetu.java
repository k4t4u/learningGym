package org.example.setHashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TworzyHashMapKonwertujeDoSetu {

    public static void main(String[] args) {
        Map<String, Kot> mapa = utworzMap();
        Set<Kot> set = konwertujMapDoSet(mapa);
        printSetKotow(set);
    }

    public static Map<String, Kot> utworzMap() {
        HashMap<String, Kot> result = new HashMap<String, Kot>();

        result.put("1", new Kot("Aberald"));
        result.put("2", new Kot("Aeda"));
        result.put("3", new Kot("Sdas"));
        result.put("4", new Kot("Cxsaw"));
        result.put("5", new Kot("Dsaw"));
        result.put("6", new Kot("Awqd"));
        result.put("7", new Kot("Qwerrt"));
        result.put("8", new Kot("Qwedsa"));
        result.put("9", new Kot("Qwedsazxc"));
        result.put("10", new Kot("Adswqc"));

        return result;
    }

    public static Set<Kot> konwertujMapDoSet(Map<String, Kot> mapa) {
        return new HashSet<Kot>(mapa.values());
    }

    public static void printSetKotow(Set<Kot> set) {
        for (Kot kot : set) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;

        public Kot(String imie) {
            this.imie = imie;
        }

        public String toString() {
            return "Kot " + this.imie;
        }
    }
}
