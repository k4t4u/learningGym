package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class liczeniePoIndexachParzystychINieparzystychWprowadzonychLiczb {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[15];
        int parzyste = 0;
        int nieparzyste = 0;


        for (int i = 0; i < 15; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                parzyste += tablica[i];
            } else {
                nieparzyste += tablica[i];
            }
        }

        if (parzyste > nieparzyste) {
            System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");

        } else if (nieparzyste > parzyste) {
            System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach");
        }
    }
}
