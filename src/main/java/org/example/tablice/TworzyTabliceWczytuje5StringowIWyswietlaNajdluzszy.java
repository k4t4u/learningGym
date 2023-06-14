package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TworzyTabliceWczytuje5StringowIWyswietlaNajdluzszy {

    private static List<String> strings;

    public static void main(String[] args) throws Exception {

        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String maxSize = strings.get(0);
        for (String element : strings) {
            if (element.length() > maxSize.length()) {
                maxSize = element;
            }
        }

        for (String element : strings) {
            if (element.length() == maxSize.length()) {
                System.out.println(element);
            }
        }
    }
}
