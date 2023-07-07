package org.example.petle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CzytaWyrazyLiczyPojedynczeLitery {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "aąbcćdeęfghijklłmnńoóprsśtuwyzźż";
        char[] abcTablica = abc.toCharArray();

        ArrayList<Character> alfabet = new ArrayList<>();
        for (char litera : abcTablica) {
            alfabet.add(litera);
        }

        // read words
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lista.add(s.toLowerCase());
        }

        //counting
        int[] count = new int[alfabet.size()];
        for (String s : lista) {
            for (char c : s.toCharArray()) {
                int index = alfabet.indexOf(c);
                if (index < 0) {
                    continue;
                }
                count[index]++;
            }
        }

        //output
        for (int i = 0; i < alfabet.size(); i++) {
            char c = alfabet.get(i);
            System.out.println(c + " " + count[i]);
        }
    }
}
