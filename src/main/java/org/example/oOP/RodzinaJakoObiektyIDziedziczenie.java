package org.example.oOP;

public class RodzinaJakoObiektyIDziedziczenie {

    public static void main(String[] args) {
        Ludzie ludz1 = new Ludzie("Anna", false, 21);
        Ludzie ludz2 = new Ludzie("Hanna", false, 20);
        Ludzie ludz3 = new Ludzie("Ola", false, 19);
        Ludzie ludz4 = new Ludzie("Pola", false, 18);

        Ludzie ludz5 = new Ludzie("Daria", false, 18, ludz1, ludz2);
        Ludzie ludz6 = new Ludzie("Maria", false, 20, ludz3, ludz4);

        Ludzie ludz7 = new Ludzie("Piotr", true, 32, ludz5, ludz6);
        Ludzie ludz8 = new Ludzie("Marta", false, 17, ludz5, ludz6);
        Ludzie ludz9 = new Ludzie("Kara", false, 17, ludz5, ludz6);

        System.out.println(ludz1);
        System.out.println(ludz2);
        System.out.println(ludz3);
        System.out.println(ludz4);
        System.out.println(ludz5);
        System.out.println(ludz6);
        System.out.println(ludz7);
        System.out.println(ludz8);
        System.out.println(ludz9);
    }

    public static class Ludzie {
        String imie;
        boolean plec;
        int wiek;
        Ludzie ojciec;
        Ludzie matka;

        Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
        }

        Ludzie(String imie, boolean plec, int wiek, Ludzie ojciec, Ludzie matka) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.ojciec = ojciec;
            this.matka = matka;
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null) {
                tekst += ", ojciec: " + this.ojciec.imie;
            }

            if (this.matka != null) {
                tekst += ", matka: " + this.matka.imie;
            }

            return tekst;
        }
    }
}
