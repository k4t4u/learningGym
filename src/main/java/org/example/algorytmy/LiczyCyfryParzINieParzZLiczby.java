package org.example.algorytmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LiczyCyfryParzINieParzZLiczby {


    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        while (count > 0) {
            if (count % 2 == 0) {
                parzyste++;
            } else {
                nieparzyste++;
            }
            count = count / 10;  // dzieli zeby pomniejszyc o jedna cyfre
        }
        System.out.println("Parzyste: " + parzyste + " Nieparzyste: " + nieparzyste);
    }
}
