package org.example.oOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class relacjeMiedzyObietkami {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dziadekImie = reader.readLine();
        Kot kotDziadek = new Kot(dziadekImie);

        String babciaImie = reader.readLine();
        Kot kotBabcia = new Kot(babciaImie);

        String ojciecImie = reader.readLine();
        Kot kotOjciec = new Kot(ojciecImie, kotDziadek, null);

        String matkaImie = reader.readLine();
        Kot kotMatka = new Kot(matkaImie, null, kotBabcia);

        String synImie = reader.readLine();
        Kot kotSyn = new Kot(synImie, kotOjciec, kotMatka);

        String imieCorki = reader.readLine();
        Kot kotCorka = new Kot(imieCorki, kotOjciec, kotMatka);

        System.out.println(kotDziadek);
        System.out.println(kotBabcia);
        System.out.println(kotOjciec);
        System.out.println(kotMatka);
        System.out.println(kotSyn);
        System.out.println(kotCorka);
    }

    public static class Kot {
        private String imie;
        private Kot ojciec;

        private Kot matka;

        Kot(String imie) {
            this.imie = imie;
        }

        Kot(String imie, Kot ojciec, Kot matka) {
            this.imie = imie;
            this.ojciec = ojciec;
            this.matka = matka;
        }

        @Override
        public String toString() {
            if (ojciec == null) {
                if (matka == null) {
                    return "Imię kota to " + imie + ", brak matki, brak ojca ";
                } else {
                    return "Imię kota to " + imie + ", " + matka.imie + " to matka" + ", brak ojca";
                }
            } else {
                if (matka == null) {
                    return "Imię kota to " + imie + ", brak matki, " + ojciec.imie + " to ojciec";
                } else {
                    return "Imię kota to " + imie + ", " + matka.imie + " to matka, " + ojciec.imie + " to ojciec";
                }
            }
        }
    }
}
