package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OkreslaNajdluzszyLubNajkrotszyCiagZnakow {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lista.add(s);
        }

        String minSizeString = lista.get(0);
        int minElement = 0;
        String maxSizeString = lista.get(0);
        int maxElement = 0;

        for (int i = 0; i < 10; i++) {
            if (lista.get(i).length() < minSizeString.length()) {
                minSizeString = lista.get(i);
                minElement = i;

            } else if (lista.get(i).length() > maxSizeString.length()) {
                maxSizeString = lista.get(i);
                maxElement = i;
            }
        }

        if (minElement < maxElement) {
            System.out.println(minSizeString);

        } else if (maxElement < minElement) {
            System.out.println(maxSizeString);
        }
    }
}
