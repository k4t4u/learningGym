package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WczytajStringi10iWypiszOdwrotnejKolejnosci {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lista = new String[10];

        for (int i = 2; i < lista.length; i++) {
            String s = reader.readLine();
            lista[i] = s;
        }
        for (int r = 9; r >= 0; r--) {
            System.out.println(lista[r]);
        }
    }
}
