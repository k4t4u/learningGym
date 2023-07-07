package org.example.setHashMap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WczytujeListeStringowITworzyMapeZWartosciaPowtorzenWyrazuWLiscie {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> slowa = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            slowa.add(reader.readLine());
        }

        Map<String, Integer> mapa = liczSlowa(slowa);

        for (Map.Entry<String, Integer> para : mapa.entrySet()) {
            System.out.println(para.getKey() + " " + para.getValue());
        }
    }

    public static Map<String, Integer> liczSlowa(ArrayList<String> lista) {
        HashMap<String, Integer> wynik = new HashMap<String, Integer>();

        for (String s : lista) {
            int count = wynik.containsKey(s) ? wynik.get(s) : 0;
            wynik.put(s, count + 1);
        }

        return wynik;
    }
}
