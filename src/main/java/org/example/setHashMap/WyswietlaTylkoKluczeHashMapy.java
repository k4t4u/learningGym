package org.example.setHashMap;

import java.util.HashMap;
import java.util.Map;

public class WyswietlaTylkoKluczeHashMapy {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> mapa = new HashMap<String, String>();
        mapa.put("Sim", "Sim");
        mapa.put("Tom", "Tom");
        mapa.put("Arbus", "Arbus");
        mapa.put("Dzieciak", "Dzieciak");
        mapa.put("Kot", "Kot");
        mapa.put("Pies", "Pies");
        mapa.put("Je", "Je");
        mapa.put("Jedzonko", "Jedzonko");
        mapa.put("Gevey", "Gevey");
        mapa.put("Przytulas", "Przytulas");

        printKlucze(mapa);
    }

    public static void printKlucze(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
