package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Wczytywanie20LiczbISortowanieOdNajwiekszej {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] table = new int[20];
        for (int i = 0; i < 20; i++) {
            table[i] = Integer.parseInt(reader.readLine());
        }

        sortuj(table);

        for (int x : table) {
            System.out.println(x);
        }
    }

    public static void sortuj(int[] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = i; j < table.length; j++) {
                if (table[i] < table[j]) {
                    int temp = table[i];
                    table[i] = table[j];
                    table[j] = temp;
                }
            }
        }
    }
}
