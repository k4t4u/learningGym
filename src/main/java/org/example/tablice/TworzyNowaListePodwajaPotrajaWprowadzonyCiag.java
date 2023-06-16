package org.example.tablice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TworzyNowaListePodwajaPotrajaWprowadzonyCiag {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            lista.add(s);
        }

        ArrayList<String> listaWielkimiLiterami = new ArrayList<String>();
        for (int i = 0; i < lista.size(); i++) {
            String s = lista.get(i);
            String result = (s.length() % 2 == 0) ? s + " " + s : s + " " + s + " " + s;
            listaWielkimiLiterami.add(result.toUpperCase());
        }

        for (int i = 0; i < listaWielkimiLiterami.size(); i++) {
            System.out.println(listaWielkimiLiterami.get(i));
        }
    }
}
