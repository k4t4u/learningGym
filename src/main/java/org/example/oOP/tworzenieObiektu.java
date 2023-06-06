package org.example.oOP;

public class tworzenieObiektu {
    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        osoba.inicjalizuj("Anka", 18);
    }

    static class Osoba {
        String imie;
        int wiek;

        public void inicjalizuj(String imie, int wiek) {
            this.imie = imie;
            this.wiek = wiek;
        }
    }
}
