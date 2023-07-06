package org.example.algorytmy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WczytujeStringiILiczbyOrazJeSortuje {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            lista.add(s);
        }

        String[] tablica = lista.toArray(new String[lista.size()]);
        sortuj(tablica);

        for (String x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = i + 1; j < tablica.length; j++) {
                if (isLiczba(tablica[i]) && isLiczba(tablica[j])) {
                    if (Integer.parseInt(tablica[i]) < Integer.parseInt(tablica[j])) {
                        String memory = tablica[i];
                        tablica[i] = tablica[j];
                        tablica[j] = memory;
                    }

                } else if (!isLiczba(tablica[i]) && !isLiczba(tablica[j])) {
                    if (isWiekszeOd(tablica[i], tablica[j])) {
                        String memory = tablica[i];
                        tablica[i] = tablica[j];
                        tablica[j] = memory;
                    }
                }
            }
        }
    }

    // Metoda porównywania ciągów: 'a' jest większe niż 'b'
    public static boolean isWiekszeOd(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Czy przekazywany ciąg jest liczbą?
    public static boolean isLiczba(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i != 0 && c == '-') { // Ciąg zawiera łącznik
                return false;
            }
            if (!Character.isDigit(c) && c != '-') { // lub nie jest liczbą i nie zaczyna się łącznikiem
                return false;
            }
            if (i == 0 && c == '-' && chars.length == 1) { // lub jest pojedynczym łącznikiem
                return false;
            }
        }
        return true;
    }
}
