package org.example.oOP;

public class tworzenieMetodIKonstruktorow {


    String imie = null;
    int wiek = 5;
    int waga = 2;
    String adres = null;
    String kolor = "Bialy";

    public void inicjalizuj(String imie) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
        this.kolor = kolor;
    }

    public void inicjalizuj(String imie, int waga, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
        this.kolor = kolor;
    }

    public void inicjalizuj(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
        this.kolor = kolor;
    }

    public void inicjalizuj(int waga, String kolor) {
        this.wiek = wiek;
        this.waga = waga;
        this.kolor = kolor;
    }

    public void inicjalizuj(int waga, String kolor, String adres) {
        this.wiek = wiek;
        this.waga = waga;
        this.kolor = kolor;
        this.adres = adres;
    }

    public static void main(String[] args) {
    }
}


class Prostokat {

    int gora;
    int lewy;
    int szerokosc;
    int wysokosc;

    public Prostokat(int lewy, int gora, int szerokosc, int wysokosc){
        this.lewy = lewy;
        this.gora = gora;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public Prostokat(int lewy, int gora){
        this.lewy = lewy;
        this.gora = gora;
        this.szerokosc = 0;
        this.wysokosc = 0;
    }

    public Prostokat(int lewy, int gora, int szerokosc){
        this.lewy = lewy;
        this.gora = gora;
        this.szerokosc = szerokosc;
        this.wysokosc = szerokosc;
    }

    public Prostokat(Prostokat kopia){
        this.lewy = kopia.lewy;
        this.gora = kopia.gora;
        this.szerokosc = kopia.szerokosc;
        this.wysokosc = kopia.wysokosc;
    }

    public static void main(String[] args) {

    }
}