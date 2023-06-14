package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListaUsuwaOstatniElementIDodajeJakoPierwszy {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            lista.add(s);
        }

        for (int i = 0; i < 13; i++) {
            String s = lista.remove(4);
            lista.add(0, s);
        }

        for (String s : lista) {
            System.out.println(s);
        }
    }
}
