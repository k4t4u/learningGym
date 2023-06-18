package org.example.oOP;

import java.util.ArrayList;
import java.util.Collections;

public class TworzenieObiektowIDziedziczenieIch {

    public static void main(String[] args) {

        Ludzie dziecko = new Ludzie("Dziecko", true, 15);
        Ludzie dziecko2 = new Ludzie("Dziecko2", false, 17);
        Ludzie dziecko3 = new Ludzie("Dziecko3", false, 20);

        Ludzie ojciec = new Ludzie("Ojciec", true, 34, dziecko, dziecko2, dziecko3);
        Ludzie matka = new Ludzie("Matka", false, 23, dziecko, dziecko2, dziecko3);

        Ludzie dziadek1 = new Ludzie("Dziadek1", true, 50, ojciec);
        Ludzie babcia1 = new Ludzie("Babcia1", false, 50, ojciec);

        Ludzie dziadek2 = new Ludzie("Dziadek2", true, 56, matka);
        Ludzie babcia2 = new Ludzie("Babcia2", false, 60, matka);

        System.out.println(dziadek1);
        System.out.println(babcia1);
        System.out.println(dziadek2);
        System.out.println(babcia2);
        System.out.println(ojciec);
        System.out.println(matka);
        System.out.println(dziecko);
        System.out.println(dziecko2);
        System.out.println(dziecko3);

    }

    public static class Ludzie {
        String imie;
        boolean plec;
        int wiek;
        ArrayList<Ludzie> dzieci = new ArrayList<>();

        public Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
        }

        public Ludzie(String imie, boolean plec, int wiek, Ludzie... dzieci) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            Collections.addAll(this.dzieci, dzieci);
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i < licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }
    }

}
