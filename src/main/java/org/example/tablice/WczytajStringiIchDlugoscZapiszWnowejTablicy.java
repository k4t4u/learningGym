package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WczytajStringiIchDlugoscZapiszWnowejTablicy {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] stringList = new String[10];
        int[] intList = new int[10];

        for (int i = 0; i < 10; i++) {
            stringList[i] = reader.readLine();
            intList[i] = stringList[i].length();
        }

        for (int i = 0; i < stringList.length; i++) {
            System.out.println(intList[i]);
        }
    }
}
