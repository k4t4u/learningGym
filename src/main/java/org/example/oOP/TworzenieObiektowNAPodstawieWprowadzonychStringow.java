package org.example.oOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TworzenieObiektowNAPodstawieWprowadzonychStringow {

    public final static ArrayList<Kot> KOTY = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String imie = reader.readLine();
            String wiek = reader.readLine();
            String waga = reader.readLine();
            String dlugoscOgona = reader.readLine();

            if (imie.isEmpty()) {
                break;
            }

            Kot kot = new Kot(imie, Integer.parseInt(wiek), Integer.parseInt(waga), Integer.parseInt(dlugoscOgona));
            KOTY.add(kot);
        }

        printLista();
    }

    public static void printLista() {
        for (Kot kot : KOTY) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;
        private int wiek;
        private int waga;
        private int dlugoscOgona;

        Kot(String imie, int wiek, int waga, int dlugoscOgona) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.dlugoscOgona = dlugoscOgona;
        }

        @Override
        public String toString() {
            return "Imię kota: " + imie + ", wiek: " + wiek + ", waga: " + waga + ", ogon: " + dlugoscOgona;
        }
    }
}
