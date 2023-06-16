package org.example.petlaWhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class petlaWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String txt = reader.readLine();
            if (txt.equals("koniec")) {
                break;
            }
            list.add(txt);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
