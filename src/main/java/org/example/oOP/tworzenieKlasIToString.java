package org.example.oOP;

public class tworzenieKlasIToString {

    public static void main(String[] args) {

        Mezczyzna mezczyzna1 = new Mezczyzna("Radel", 22, "Dworcowa");
        Mezczyzna mezczyzna2 = new Mezczyzna("Chuj", 18, "Dupa");

        Kobieta kobieta1 = new Kobieta("Anka", 19, "Do");
        Kobieta kobieta2 = new Kobieta("Hanka", 22, "Jebanka");

        System.out.println(mezczyzna1);
        System.out.println(mezczyzna2);

        System.out.println(kobieta1);
        System.out.println(kobieta2);

    }

    public static class Mezczyzna {
        String imie;
        int wiek;
        String adres;

        public Mezczyzna(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }

        public String toString() {
            return (imie + " " + wiek + " " + adres);
        }
    }

    public static class Kobieta {
        String imie;
        int wiek;
        String adres;

        public Kobieta(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }

        public String toString() {
            return (imie + " " + wiek + " " + adres);
        }
    }
}