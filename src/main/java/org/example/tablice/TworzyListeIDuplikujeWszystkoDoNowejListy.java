package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TworzyListeIDuplikujeWszystkoDoNowejListy {
    public static void main(String[] args) throws Exception {

        BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reder.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> lista) {

        ArrayList<String> result = new ArrayList<>();
        for (String s : lista) {
            result.add(s);
            result.add(s);
        }
        return result;
    }
}
