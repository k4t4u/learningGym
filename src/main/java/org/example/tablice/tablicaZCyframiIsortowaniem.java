package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tablicaZCyframiIsortowaniem {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[20];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sortuj(tablica);

        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);
        System.out.println(tablica[3]);
        System.out.println(tablica[4]);
    }

    public static void sortuj(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = i; j < tablica.length; j++) {
                if (tablica[i] < tablica[j]) {
                    int temp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }
    }
}
}
