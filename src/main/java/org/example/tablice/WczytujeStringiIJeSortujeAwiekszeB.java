package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WczytujeStringiIJeSortujeAwiekszeB {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tablica = new String[20];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = reader.readLine();
        }

        sortuj(tablica);

        for (String x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = i; j < tablica.length; j++) {
                if (isWiekszeOd(tablica[i], tablica[j])) {
                    String memory = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = memory;
                }
            }
        }
    }

    // Metoda porównywania ciągów: 'a' jest większe niż 'b'
    public static boolean isWiekszeOd(String a, String b) {

        return a.compareTo(b) > 0;
    }
}
