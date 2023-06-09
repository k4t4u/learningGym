package org.example.tablice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tworzyTabliceWczytujeZKonsoliIWyswietlaMax {
    public static void main(String[] args) throws Exception {
        int[] tablica = inicjalizujTablice();
        int max = max(tablica);
        System.out.println(max);
    }

    public static int[] inicjalizujTablice() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] lista = new int[20];
        for (int i = 0; i < lista.length; i++) {
            String s = reader.readLine();
            lista[i] = Integer.parseInt(s);
        }
        return lista;
    }

    public static int max(int[] tablica) {
        int max = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] > max)
                max = tablica[i];
        }
        return max;
    }
}
